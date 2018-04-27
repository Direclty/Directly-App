package com.directly.luckyboard.app;

import android.app.Application;

/**
 * @author Xiao-Long Zhou
 * @date 2018/4/26 17:03
 */

public class MyApplication extends Application {

    private static MyApplication instance;

    public static synchronized Application getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        instance = this;
    }

}
