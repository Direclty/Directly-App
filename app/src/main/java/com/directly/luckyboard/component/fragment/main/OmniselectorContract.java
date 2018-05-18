package com.directly.luckyboard.component.fragment.main;

import com.directly.luckyboard.base.presenter.AbstractPresenter;
import com.directly.luckyboard.base.view.BaseView;

/**
 * @author Xiao-Long Zhou
 * @date 2018/5/17 14:53
 */

public class OmniselectorContract {

    interface View extends BaseView{

        void showOmniselectorList();
    }

    interface Presenter extends AbstractPresenter<View> {

        void loadOmniselectorList();

    }
}
