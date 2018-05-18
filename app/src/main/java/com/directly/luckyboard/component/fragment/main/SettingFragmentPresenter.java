package com.directly.luckyboard.component.fragment.main;

import com.directly.luckyboard.base.presenter.BasePresenter;
import com.directly.luckyboard.core.DataManager;

import javax.inject.Inject;

/**
 * @author Xiao-Long Zhou
 * @date 2018/5/17 15:14
 */

public class SettingFragmentPresenter extends BasePresenter<SettingFragmentContract.View> implements SettingFragmentContract.Presenter {

    @Inject
    public SettingFragmentPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void setting() {

    }

    @Override
    public void detachView() {
        super.detachView();
    }

    @Override
    public void attachView(SettingFragmentContract.View view) {
        super.attachView(view);
    }
}
