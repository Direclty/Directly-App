package com.directly.luckyboard.base.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.directly.luckyboard.app.DirectlyApplication;
import com.directly.luckyboard.base.presenter.AbstractPresenter;
import com.directly.luckyboard.base.view.BaseView;
import com.directly.luckyboard.di.component.DaggerFragmentComponent;
import com.directly.luckyboard.di.component.FragmentComponent;
import com.directly.luckyboard.di.module.FragmentModule;

import javax.inject.Inject;

/**
 * MVP模式的Base fragment
 *
 * @author quchao
 * @date 2017/11/28
 */

public abstract class BaseFragment<T extends AbstractPresenter> extends AbstractSimpleFragment implements BaseView {

    @Inject
    protected T mPresenter;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        initInject();
        if (mPresenter != null) {
            mPresenter.attachView(this);
        }
        super.onViewCreated(view, savedInstanceState);
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
