package com.directly.luckyboard.base.presenter;

import com.directly.luckyboard.base.view.BaseView;

import io.reactivex.disposables.Disposable;

/**
 * @author Xiao-Long Zhou
 * @date 2018/4/26 16:49
 */

public interface AbstractPresenter<T extends BaseView> {
    /**
     * 注入View
     *
     * @param view view
     */
    void attachView(T view);

    /**
     * 回收View
     */
    void detachView();

    /**
     * Add rxBing subscribe manager
     *
     * @param disposable Disposable
     */
    void addRxBindingSubscribe(Disposable disposable);
}
