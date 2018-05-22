package com.directly.luckyboard.component.fragment.main;

import com.directly.luckyboard.R;
import com.directly.luckyboard.base.fragment.AbstractRootFragment;

/**
 * @author Xiao-Long Zhou
 * @date 2018/5/17 14:15
 */

public class MainPagerFragment extends AbstractRootFragment<MainPagerPresenter> implements MainPagerContract.View {


    public static MainPagerFragment getInstance(boolean param1, String param2) {
        MainPagerFragment fragment = new MainPagerFragment();
        return fragment;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_main_pager;
    }

    @Override
    protected void initEventAndData() {

        super.initEventAndData();

        mPresenter.loadNewListData();
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
    public void showNewList() {

    }

    @Override
    protected void initInject() {
        getFragmentComponent().inject(this);
    }
}
