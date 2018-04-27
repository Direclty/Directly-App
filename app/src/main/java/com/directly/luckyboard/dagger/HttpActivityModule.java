package com.directly.luckyboard.dagger;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * @author Xiao-Long Zhou
 * @date 2018/4/27 16:47
 */

@Module
public class HttpActivityModule {
    @Provides
    OkHttpClient providesOkHttpClient() {
        return new OkHttpClient();
    }
}
