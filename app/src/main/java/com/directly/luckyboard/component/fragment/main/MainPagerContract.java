package com.directly.luckyboard.component.fragment.main;

import com.directly.luckyboard.base.presenter.AbstractPresenter;
import com.directly.luckyboard.base.view.BaseView;

import java.util.List;

/**
 * @author Xiao-Long Zhou
 * @date 2018/5/17 14:16
 */

public class MainPagerContract {

    interface View extends BaseView {

        /**
         * show news list message
         */
        void showNewList();

    }

    interface Presenter extends AbstractPresenter<View> {

        /**
         * Load main pager data
         */
        void loadNewListData();

        /**
         * Get banner data
         */
        void getBannerData();

        /**
         * Auto refresh
         */
        void autoRefresh();

        /**
         * Load more
         */
        void loadMore();

    }

}
