package com.directly.luckyboard.di.module;


import com.directly.luckyboard.app.DirectlyApplication;
import com.directly.luckyboard.core.DataManager;
import com.directly.luckyboard.core.db.DbHelper;
import com.directly.luckyboard.core.db.GreenDaoHelper;
import com.directly.luckyboard.core.http.HttpHelper;
import com.directly.luckyboard.core.http.RetrofitHelper;
import com.directly.luckyboard.core.prefs.PreferenceHelper;
import com.directly.luckyboard.core.prefs.PreferenceHelperImpl;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

/**
 * @author quchao
 * @date 2017/11/27
 */

@Module
public class AppModule {

    private final DirectlyApplication application;

    public AppModule(DirectlyApplication application) {
        this.application = application;
    }

    @Provides
    @Singleton
    DirectlyApplication provideApplicationContext() {
        return application;
    }

    @Provides
    @Singleton
    HttpHelper provideHttpHelper(RetrofitHelper retrofitHelper) {
        return retrofitHelper;
    }

    @Provides
    @Singleton
    DbHelper provideDBHelper(GreenDaoHelper realmHelper) {
        return realmHelper;
    }

    @Provides
    @Singleton
    PreferenceHelper providePreferencesHelper(PreferenceHelperImpl implPreferencesHelper) {
        return implPreferencesHelper;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(HttpHelper httpHelper, DbHelper dbhelper, PreferenceHelper preferencesHelper) {
        return new DataManager(httpHelper, dbhelper, preferencesHelper);
    }

}
