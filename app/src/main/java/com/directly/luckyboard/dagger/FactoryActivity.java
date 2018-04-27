package com.directly.luckyboard.dagger;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

/**
 * @author Xiao-Long Zhou
 * @date 2018/4/27 16:01
 */

public class FactoryActivity extends AppCompatActivity {

    private static final String TAG = "FactoryActivity";
    @Inject
    Factory factory;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DaggerFactoryActivityComponent.create().Inject(this);
        Log.d(TAG, "onCreate: " + factory.hashCode());

        Log.d(TAG, "onCreate: " + factory.product.hashCode());

    }
}
