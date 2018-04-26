package com.directly.luckyboard.base.presenter;

import com.directly.luckyboard.base.view.BaseView;

import io.reactivex.disposables.Disposable;

/**
 * @author Xiao-Long Zhou
 * @date 2018/4/26 16:37
 */

public class BasePresenter<T extends BaseView> implements AbstractPresenter<T> {

    @Override
    public void attachView(T view) {

    }

    @Override
    public void detachView() {

    }

    @Override
    public void addRxBindingSubscribe(Disposable disposable) {

    }

}
