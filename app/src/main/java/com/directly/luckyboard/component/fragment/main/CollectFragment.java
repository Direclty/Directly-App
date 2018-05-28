package com.directly.luckyboard.component.fragment.main;

import com.directly.luckyboard.R;
import com.directly.luckyboard.base.fragment.AbstractRootFragment;

/**
 * @author Xiao-Long Zhou
 * @date 2018/5/17 15:14
 */

public class CollectFragment extends AbstractRootFragment<CollectPresenter> implements CollectContract.View{

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_collection;
    }

    public static CollectFragment getInstance(String str1, String str2) {
        return new CollectFragment();
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

    @Override
    public void showCollection() {

    }

    @Override
    protected void initInject() {
        getFragmentComponent().inject(this);
    }
}
