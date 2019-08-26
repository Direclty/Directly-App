package com.directly.luckyboard.component.fragment.main.mainchild;

import com.directly.luckyboard.base.presenter.BasePresenter;
import com.directly.luckyboard.component.activity.login.LoginContract;
import com.directly.luckyboard.core.DataManager;

/**
 * @author Long-Xiao zhou
 * @date 2019-08-26
 */
public class LocationPresenter extends BasePresenter<LocationContract.View>
        implements LocationContract.Presenter, LocationContract.View {
    public LocationPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void start() {

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
}
