package com.directly.luckyboard.component.fragment.main;

import com.directly.luckyboard.base.presenter.AbstractPresenter;
import com.directly.luckyboard.base.view.BaseView;

/**
 * @author Xiao-Long Zhou
 * @date 2018/5/17 14:16
 */

class MainPagerContract {

    interface View extends BaseView {

    }

    interface Presenter extends AbstractPresenter<View> {

    }

}
