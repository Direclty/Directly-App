package com.directly.luckyboard.dagger;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

/**
 * @author Xiao-Long Zhou
 * @date 2018/4/27 16:52
 */

public class HttpActivity extends AppCompatActivity {

    @Inject
    HttpActivityModule httpActivityModule;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        httpActivityModule.providesOkHttpClient();
    }
}
