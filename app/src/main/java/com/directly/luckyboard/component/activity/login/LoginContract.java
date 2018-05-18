package com.directly.luckyboard.component.activity.login;

import com.directly.luckyboard.base.presenter.AbstractPresenter;
import com.directly.luckyboard.base.view.BaseView;

/**
 * @author Xiao-Long Zhou
 * @date 2018/4/27 10:29
 */

public interface LoginContract {

    interface View extends BaseView {
        /**
         * request login message View
         */
        void loginView();

        /**
         * request login out message View
         */
        void loginOutView();

        /**
         * request register message View
         */
        void registerView();
    }

    interface Presenter extends AbstractPresenter<View> {
        /**
         * login API
         *
         * @param name     User name
         * @param password User password
         */
        void loadLoginMessage(String name, String password);

        /**
         * login out API
         *
         * @param uid User id
         */
        void requestLoginOutMessage(String uid);

        /**
         * register API
         *
         * @param name     User name
         * @param password User password
         * @param code     Auth code
         */
        void registerView(String name, String password, String code);
    }
}
