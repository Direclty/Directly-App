package com.directly.luckyboard.component.fragment.main;

import com.directly.luckyboard.base.presenter.AbstractPresenter;
import com.directly.luckyboard.base.view.BaseView;
import com.directly.luckyboard.component.bean.BannerData;
import com.directly.luckyboard.component.bean.NewsData;
import com.directly.luckyboard.core.bean.BaseResponse;

import java.util.List;

/**
 * @author Xiao-Long Zhou
 * @date 2018/5/17 14:16
 */

class MainPagerContract {

    interface View extends BaseView {

        /**
         * show news list message
         *
         * @param data 首页数据
         */
        void showNewList(BaseResponse<NewsData> data);

        /**
         * 展示轮播图
         *
         * @param data banner数据
         */
        void showBanner(BaseResponse<List<BannerData>> data);

    }

    interface Presenter extends AbstractPresenter<View> {

        /**
         * Load main pager data
         */
        void loadNewListDataAndBanner();

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
