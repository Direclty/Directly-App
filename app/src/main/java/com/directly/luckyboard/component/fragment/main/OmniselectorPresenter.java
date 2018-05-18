package com.directly.luckyboard.component.fragment.main;

import com.directly.luckyboard.base.presenter.BasePresenter;
import com.directly.luckyboard.core.DataManager;

import javax.inject.Inject;

/**
 * @author Xiao-Long Zhou
 * @date 2018/5/17 14:53
 */

public class OmniselectorPresenter extends BasePresenter<OmniselectorContract.View> implements OmniselectorContract.Presenter {

    @Inject
    public OmniselectorPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void loadOmniselectorList() {

    }

    @Override
    public void attachView(OmniselectorContract.View view) {
        super.attachView(view);
    }

    @Override
    public void detachView() {
        super.detachView();
    }
}
