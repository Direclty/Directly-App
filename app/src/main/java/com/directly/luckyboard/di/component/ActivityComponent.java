package com.directly.luckyboard.di.component;

import android.app.Activity;
//add the location activity 2019-08-27 begin
import com.directly.luckyboard.component.activity.login.LoginActivity;
//add the location activity 2019-08-27 end
import com.directly.luckyboard.component.activity.main.MainActivity;
import com.directly.luckyboard.component.fragment.main.mainchild.LocationActivity;
import com.directly.luckyboard.di.module.ActivityModule;
import com.directly.luckyboard.di.scope.ActivityScope;

import dagger.Component;


/**
 * @author quchao
 * @date 2017/11/27
 */

@ActivityScope
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    /**
     * 获取Activity实例
     *
     * @return Activity
     */
    Activity getActivity();

    /**
     * 注入MAinActivity所需的依赖
     *
     * @param mainActivity MainActivity
     */
    void inject(MainActivity mainActivity);

    /**
     * 注入LoginActivity所需的依赖
     *
     * @param loginActivity LoginActivity
     */
    void inject(LoginActivity loginActivity);

    //add the location activity 2019-08-27 begin
    /**
     * 注入LocationActivity所需的依赖
     * @param locationActivity
     */
    void inject(LocationActivity locationActivity);
    //add the location activity 2019-08-27 begin
}
