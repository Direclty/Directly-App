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

    public void initData() {

    }

    public void initView() {
    }

    public void firstInitMessage() {

    }

    protected abstract int getResourcesId();
}
