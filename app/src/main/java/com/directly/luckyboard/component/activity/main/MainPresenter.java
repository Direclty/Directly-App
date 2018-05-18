package com.directly.luckyboard.component.activity.main;

import com.directly.luckyboard.base.presenter.BasePresenter;
import com.directly.luckyboard.core.DataManager;

import javax.inject.Inject;


/**
 * @author quchao
 * @date 2017/11/28
 */

public class MainPresenter extends BasePresenter<MainContract.View> implements MainContract.Presenter, MainContract.View {

    private DataManager dataManager;

    @Inject
    public MainPresenter(DataManager dataManager) {
        super(dataManager);
        this.dataManager = dataManager;
    }

    @Override
    public void detachView() {
        super.detachView();
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
    public void reload() {

    }


    @Override
    public void showSwitchProject() {

    }

    @Override
    public void showSwitchNavigation() {

    }

    @Override
    public void setCurrentPage(int page) {

    }

    @Override
    public void setNightModeState(boolean b) {

    }
}

