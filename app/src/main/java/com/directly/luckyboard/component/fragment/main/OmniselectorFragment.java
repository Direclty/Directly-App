package com.directly.luckyboard.component.fragment.main;

import com.directly.luckyboard.R;
import com.directly.luckyboard.base.fragment.AbstractRootFragment;

/**
 * @author Xiao-Long Zhou
 * @date 2018/5/17 14:53
 */

public class OmniselectorFragment extends AbstractRootFragment<OmniselectorPresenter> implements OmniselectorContract.View {


    public static OmniselectorFragment getInstance(String str1, String str2) {

        return new OmniselectorFragment();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_omniselector;
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
    public void showOmniselectorList() {

    }

    @Override
    protected void initInject() {
        getFragmentComponent().inject(this);
    }
}
