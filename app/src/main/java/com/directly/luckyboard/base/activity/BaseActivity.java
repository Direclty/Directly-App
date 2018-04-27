package com.directly.luckyboard.base.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.directly.luckyboard.app.MyApplication;
import com.directly.luckyboard.base.presenter.BasePresenter;
import com.directly.luckyboard.base.view.BaseView;

/**
 * @author Xiao-Long zhou
 * @date 2018/04/26
 */
public abstract class BaseActivity<T extends BasePresenter> extends AbstractSimpleActivity implements BaseView {
    protected T mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
    }

    @Override
    protected void onDestroy() {
        if (mPresenter != null) {
            mPresenter.detachView();
        }
        super.onDestroy();
    }

    @Override
    protected void onViewCreated() {
        initInject();
        if (mPresenter != null) {
            mPresenter.attachView(this);
        }
        super.onViewCreated();
    }

//    protected ActivityComponent getActivityComponent() {
//        return DaggerActivityComponent.builder()
//                .appComponent(MyApplication.getAppComponent())
//                .activityModule(new ActivityModule(this))
//                .build();
//    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    public void showDialog() {

    }

    @Override
    public void showErrorView(boolean isShowT, boolean isShowView) {

    }

    @Override
    public void closeDialog() {

    }

    /**
     * 注入当前Activity所需的依赖
     */
    protected abstract void initInject();
}
