package com.directly.luckyboard.base.activity;

import com.directly.luckyboard.app.DirectlyApplication;
import com.directly.luckyboard.base.presenter.AbstractPresenter;
import com.directly.luckyboard.base.view.BaseView;
import com.directly.luckyboard.di.component.ActivityComponent;
import com.directly.luckyboard.di.component.DaggerActivityComponent;
import com.directly.luckyboard.di.module.ActivityModule;

import javax.inject.Inject;

/**
 * MVP模式的Base Activity
 *
 * @author quchao
 * @date 2017/11/28
 */

public abstract class BaseActivity<T extends AbstractPresenter> extends AbstractSimpleActivity implements BaseView {

    @Inject
    protected T mPresenter;

    @Override
    protected void onDestroy() {
        if (mPresenter != null) {
            mPresenter.detachView();
        }
        super.onDestroy();
    }

    public ActivityComponent getActivityAppComponent(){
        return DaggerActivityComponent.builder()
                .activityModule(new ActivityModule(this))
                .appComponent(DirectlyApplication.getAppComponent())
                .build();
    }

    @Override
    protected void onViewCreated() {
        super.onViewCreated();
        initInject();
        if (mPresenter != null) {
            mPresenter.attachView(this);
        }
    }

    /**
     * 注入当前Activity所需的依赖
     */
    protected abstract void initInject();

}
