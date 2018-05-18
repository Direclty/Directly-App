package com.directly.luckyboard.component.fragment.main;

import com.directly.luckyboard.R;
import com.directly.luckyboard.base.fragment.AbstractRootFragment;

import io.reactivex.disposables.Disposable;

/**
 * @author Xiao-Long Zhou
 * @date 2018/5/17 14:35
 */

public class KnowledgeStudyFragment extends AbstractRootFragment<KnowledgeStudyPresenter> implements KnowledgeStudyContract.View {

    /**
     * 初始化
     *
     * @param str1
     * @param str2
     * @return
     */
    public static KnowledgeStudyFragment getInstance(String str1, String str2) {

        return new KnowledgeStudyFragment();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_konwledge_study;
    }

    @Override
    protected void initInject() {
        getFragmentComponent().inject(this);
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
    public void showKnowledgeStudyMessage() {

    }
}
