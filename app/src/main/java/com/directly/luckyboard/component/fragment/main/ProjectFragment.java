package com.directly.luckyboard.component.fragment.main;

import com.directly.luckyboard.R;
import com.directly.luckyboard.base.fragment.AbstractRootFragment;

/**
 * @author Xiao-Long Zhou
 * @date 2018/5/17 15:14
 */

public class ProjectFragment extends AbstractRootFragment<ProjectPresenter> implements ProjectContract.View{

    public static ProjectFragment getInstance(String str1, String str2) {
        return new ProjectFragment();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_project;
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
    public void showProjectMessage() {

    }

    @Override
    protected void initInject() {
        getFragmentComponent().inject(this);
    }
}
