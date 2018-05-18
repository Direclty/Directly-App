package com.directly.luckyboard.component.fragment.main;

import com.directly.luckyboard.base.presenter.BasePresenter;
import com.directly.luckyboard.core.DataManager;

import javax.inject.Inject;

/**
 * @author Xiao-Long Zhou
 * @date 2018/5/17 15:32
 */

public class CollectPresenter extends BasePresenter<CollectContract.View> implements CollectContract.Presenter {

    @Inject
    public CollectPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void attachView(CollectContract.View view) {
        super.attachView(view);
    }

    @Override
    public void detachView() {
        super.detachView();
    }

    @Override
    public void loadCollection() {

    }
}
