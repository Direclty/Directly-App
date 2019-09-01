package com.directly.luckyboard.component.fragment.main.mainchild;

import com.directly.luckyboard.R;
import com.directly.luckyboard.base.activity.BaseActivity;

/**
 * @author Long-Xiao zhou
 * @date 2019-08-26
 */
public class LocationActivity extends BaseActivity<LocationPresenter> implements LocationContract.View{
    //add the location activity 2019-08-27 begin
    @Override
    protected void initInject() {
        getActivityAppComponent().inject(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.loading_view;
    }
    //add the location activity 2019-08-27 begin

    @Override
    protected void initEventAndData() {
        mPresenter.loadLocationMessage();
        mPresenter.upLocationMessage();
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
    public void loadLocationView() {

    }

    @Override
    public void upLocationView() {

    }
}
