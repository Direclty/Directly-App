package com.directly.luckyboard.component.fragment.main;

import com.directly.luckyboard.base.presenter.BasePresenter;
import com.directly.luckyboard.core.DataManager;

import javax.inject.Inject;

/**
 * @author Xiao-Long Zhou
 * @date 2018/5/17 14:35
 */

public class KnowledgeStudyPresenter extends BasePresenter<KnowledgeStudyContract.View> implements KnowledgeStudyContract.Presenter{

    @Inject
    public KnowledgeStudyPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void loadKnowledgeStudyList() {

    }

    @Override
    public void detachView() {
        super.detachView();
    }

    @Override
    public void attachView(KnowledgeStudyContract.View view) {
        super.attachView(view);
    }
}
