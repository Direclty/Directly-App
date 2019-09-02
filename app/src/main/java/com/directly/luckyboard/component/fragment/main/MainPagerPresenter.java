package com.directly.luckyboard.component.fragment.main;

import com.directly.luckyboard.base.presenter.BasePresenter;
import com.directly.luckyboard.core.DataManager;

import javax.inject.Inject;


/**
 * @author Xiao-Long Zhou
 * @date 2018/5/17 14:16
 */

public class MainPagerPresenter extends BasePresenter<MainPagerContract.View> implements MainPagerContract.Presenter {

    private DataManager mDataManager;
    private boolean isRefresh = true;
    private int mCurrentPage;

    @Inject
    MainPagerPresenter(DataManager dataManager) {
        super(dataManager);
        this.mDataManager = dataManager;
    }

    @Override
    public void attachView(MainPagerContract.View view) {
        super.attachView(view);
    }

    @Override
    public void detachView() {
        super.detachView();
    }
}
