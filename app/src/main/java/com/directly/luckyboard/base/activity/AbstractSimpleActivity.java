package com.directly.luckyboard.base.activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;

import me.yokeyword.fragmentation.SupportActivity;

import android.support.v7.widget.Toolbar;

import com.directly.luckyboard.app.ActivityCollector;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * @author Xiao-Long Zhou
 * @date 2018/4/26 17:01
 */

public abstract class AbstractSimpleActivity extends SupportActivity {
    private Unbinder unBinder;
    protected AbstractSimpleActivity mActivity;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        unBinder = ButterKnife.bind(this);
        mActivity = this;
        onViewCreated();
        ActivityCollector.getInstance().addActivity(this);
        initEventAndData();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.getInstance().removeActivity(this);
        unBinder.unbind();
    }

    protected void setToolBar(Toolbar toolBar, CharSequence title) {
        toolBar.setTitle(title);
        setSupportActionBar(toolBar);
        assert getSupportActionBar() != null;
    }

    protected void onViewCreated() {

    }

    /**
     * 获取当前Activity的UI布局
     *
     * @return R.layout
     */
    protected abstract int getLayoutId();

    /**
     * 初始化数据
     */
    protected abstract void initEventAndData();
}
