package com.directly.luckyboard.app;

import android.annotation.SuppressLint;
import android.app.Application;
import android.database.sqlite.SQLiteDatabase;
import android.support.v4.app.FragmentActivity;

import com.directly.luckyboard.core.dao.DaoMaster;
import com.directly.luckyboard.core.dao.DaoSession;
import com.directly.luckyboard.di.component.AppComponent;
import com.directly.luckyboard.di.component.DaggerAppComponent;
import com.directly.luckyboard.di.module.AppModule;
import com.directly.luckyboard.di.module.HttpModule;
import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

/**
 * @author Xiao-Long Zhou
 * @date 2018/4/26 17:03
 */

@SuppressLint("Registered")
public class DirectlyApplication extends Application {

    private DaoSession mDaoSession;
    private static DirectlyApplication instance;
    private static volatile AppComponent appComponent;
    private RefWatcher refWatcher;

    public static synchronized DirectlyApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {

        super.onCreate();

        instance = this;

        refWatcher = LeakCanary.install(this);

        initGreenDao();
    }


    public static synchronized AppComponent getAppComponent() {

        if (appComponent == null) {
            appComponent = DaggerAppComponent.builder()
                    .appModule(new AppModule(instance))
                    .httpModule(new HttpModule())
                    .build();
        }
        return appComponent;
    }

    private void initGreenDao() {

        DaoMaster.DevOpenHelper devOpenHelper = new DaoMaster.DevOpenHelper(this, Constants.DB_NAME);
        SQLiteDatabase database = devOpenHelper.getWritableDatabase();
        DaoMaster daoMaster = new DaoMaster(database);
        mDaoSession = daoMaster.newSession();
    }

    public DaoSession getDaoSession() {
        return mDaoSession;
    }


    public static RefWatcher getRefWatcher(FragmentActivity context) {
        DirectlyApplication application = (DirectlyApplication) context.getApplicationContext();
        return application.refWatcher;
    }
}
