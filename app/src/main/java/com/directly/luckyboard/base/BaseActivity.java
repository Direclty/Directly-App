package com.directly.luckyboard.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * @author Xiao-Long zhou
 * @date 2018/04/26
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        firstInitMessage();
        setContentView(getResourcesId());
        initView();
        initData();
    }

    /**
     * 初始化数据
     */
    public void initData() {

    }

    /**
     * 初始化控件
     */
    public void initView() {

    }

    /**
     * 状态栏修改等...
     */
    public void firstInitMessage() {

    }

    /**
     * 获取资源文件
     *
     * @return R.layout
     */
    protected abstract int getResourcesId();
}
