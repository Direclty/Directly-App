package com.directly.luckyboard.presenter;

import com.directly.luckyboard.base.presenter.BasePresenter;
import com.directly.luckyboard.contract.LoginContract;

/**
 * @author Xiao-Long Zhou
 * @date 2018/4/27 10:45
 */

public class LoginPresenter extends BasePresenter<LoginContract.View> implements LoginContract.Presenter,LoginContract.View {

    @Override
    public void detachView() {
        super.detachView();
    }

    @Override
    public void attachView(LoginContract.View view) {
        super.attachView(view);
    }


    @Override
    public void loadLoginMessage(String name, String password) {

    }

    @Override
    public void requestLoginOutMessage(String uid) {

    }

    @Override
    public void registerView(String name, String password, String code) {

    }

    @Override
    public void start() {

    }

    @Override
    public void showDialog() {

    }

    @Override
    public void showErrorView(boolean isShowT, boolean isShowView) {

    }

    @Override
    public void closeDialog() {

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
}
