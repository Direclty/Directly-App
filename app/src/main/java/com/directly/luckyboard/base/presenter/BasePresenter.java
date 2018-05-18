package com.directly.luckyboard.base.presenter;

import com.directly.luckyboard.base.view.BaseView;
import com.directly.luckyboard.core.DataManager;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * @author Xiao-Long Zhou
 * @date 2018/4/26 16:37
 */

public class BasePresenter<T extends BaseView> implements AbstractPresenter<T> {

    protected T mView;
    protected DataManager manager;
    private CompositeDisposable compositeDisposable;

    public BasePresenter(DataManager dataManager) {
        this.manager = dataManager;
    }

    @Override
    public void attachView(T view) {
        this.mView = view;
    }


    @Override
    public void detachView() {
        this.mView = null;
        if (compositeDisposable != null) {
            compositeDisposable.clear();
        }
    }

    @Override
    public void addRxBindingSubscribe(Disposable disposable) {
        addSubscribe(disposable);
    }

    protected void addSubscribe(Disposable disposable) {

        if (compositeDisposable == null) {
            compositeDisposable = new CompositeDisposable();
        }
        compositeDisposable.add(disposable);
    }
}
