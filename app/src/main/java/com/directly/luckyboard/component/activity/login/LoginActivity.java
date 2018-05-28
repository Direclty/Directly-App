package com.directly.luckyboard.component.activity.login;

import com.directly.luckyboard.R;
import com.directly.luckyboard.base.activity.BaseActivity;

/**
 * @author Xiao-Long Zhou
 * @date 2018/4/27 10:43
 */

public class LoginActivity extends BaseActivity<LoginPresenter> implements LoginContract.View {


    @Override
    public void start() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initInject() {
        getActivityAppComponent().inject(this);
    }

    @Override
    public void showDialog() {

    }

    @Override
    public void showErrorView() {

    }

    @Override
    public void showErrorMsg(String message) {

    }


    @Override
    public void closeDialog() {

    }

    @Override
    public void reload() {

    }

    @Override
    public void loginView() {

    }

    @Override
    public void loginOutView() {

    }

    @Override
    public void registerView() {

    }

    @Override
    protected void initEventAndData() {

    }
}
