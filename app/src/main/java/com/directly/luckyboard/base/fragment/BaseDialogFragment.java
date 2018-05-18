package com.directly.luckyboard.base.fragment;

import android.os.Bundle;

import com.directly.luckyboard.app.DirectlyApplication;
import com.directly.luckyboard.base.presenter.AbstractPresenter;
import com.directly.luckyboard.base.view.BaseView;
import com.directly.luckyboard.di.component.DaggerFragmentComponent;
import com.directly.luckyboard.di.component.FragmentComponent;
import com.directly.luckyboard.di.module.FragmentModule;

import javax.inject.Inject;

/**
 * MVP模式的Base Dialog fragment
 *
 * @author quchao
 * @date 2017/11/28
 */

public abstract class BaseDialogFragment<T extends AbstractPresenter> extends AbstractSimpleDialogFragment implements BaseView {

    @Inject
    protected T mPresenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initInject();
        if (mPresenter != null) {
            mPresenter.attachView(this);
        }
    }

    @Override
    public void onDestroyView() {
        if (mPresenter != null) {
            mPresenter.detachView();
        }
        super.onDestroyView();
    }

    public FragmentComponent getFragmentComponent() {
        return DaggerFragmentComponent.builder()
                .appComponent(DirectlyApplication.getAppComponent())
                .fragmentModule(new FragmentModule(this))
                .build();
    }



    /**
     * 注入当前Fragment所需的依赖
     */
    protected abstract void initInject();

}
