package com.directly.luckyboard.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

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
