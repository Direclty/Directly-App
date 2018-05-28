package com.directly.luckyboard.component.fragment.main;

import com.directly.luckyboard.R;
import com.directly.luckyboard.base.fragment.AbstractRootFragment;

/**
 * @author Xiao-Long Zhou
 * @date 2018/5/17 15:14
 */

public class SettingFragment extends AbstractRootFragment<SettingFragmentPresenter> implements SettingFragmentContract.View {

    public static SettingFragment getInstance(String str1, String str2) {
        return new SettingFragment();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_setting;
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
    public void showSetting() {

    }
}
