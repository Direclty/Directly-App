package com.directly.luckyboard.widget;

import android.text.TextUtils;

import com.directly.luckyboard.R;
import com.directly.luckyboard.app.DirectlyApplication;
import com.directly.luckyboard.base.view.BaseView;
import com.directly.luckyboard.core.http.exception.ServerException;
import com.directly.luckyboard.utils.LogHelper;

import io.reactivex.observers.ResourceObserver;
import retrofit2.HttpException;

/**
 * @author Xiao-Long Zhou
 * @date 2018/5/22 15:50
 */

public abstract class BaseObserver<T> extends ResourceObserver<T> {

    private BaseView mView;
    private String mErrorMsg;
    private boolean isShowError = true;

    protected BaseObserver(BaseView view){
        this.mView = view;
    }

    protected BaseObserver(BaseView view, String errorMsg){
        this.mView = view;
        this.mErrorMsg = errorMsg;
    }

    protected BaseObserver(BaseView view, boolean isShowError){
        this.mView = view;
        this.isShowError = isShowError;
    }

    protected BaseObserver(BaseView view, String errorMsg, boolean isShowError){
        this.mView = view;
        this.mErrorMsg = errorMsg;
        this.isShowError = isShowError;
    }

    @Override
    public void onComplete() {

    }

    @Override
    public void onError(Throwable e) {

        if (mView == null) {
            return;
        }
        if (mErrorMsg != null && !TextUtils.isEmpty(mErrorMsg)) {
            mView.showErrorMsg(mErrorMsg);
        } else if (e instanceof ServerException) {
            mView.showErrorMsg(e.toString());
        } else if (e instanceof HttpException) {
            mView.showErrorMsg(DirectlyApplication.getInstance().getString(R.string.http_error));
        } else {
            mView.showErrorMsg(DirectlyApplication.getInstance().getString(R.string.unKnown_error));
            LogHelper.d(e.toString());
        }
        if (isShowError) {
            mView.showErrorView();
        }
    }
}

