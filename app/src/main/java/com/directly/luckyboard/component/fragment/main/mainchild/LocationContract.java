package com.directly.luckyboard.component.fragment.main.mainchild;

import com.directly.luckyboard.base.presenter.AbstractPresenter;
import com.directly.luckyboard.base.view.BaseView;

class LocationContract {
    interface View extends BaseView {
        /**
         * 数据请求完毕之后加载布局
         *
         * @param data 加载位置信息返回数据
         */
        void loadLocationView(String data);

        /**
         * 上传状态
         *
         * @param data 上传位置信息返回数据
         */
        void upLocationView(String data);

        /**
         * 上传联系人信息
         *
         * @param data 联系人信息返回数据
         */
        void upContactsView(String data);
    }

    interface Presenter extends AbstractPresenter<View> {
        /**
         * 加载定位数据请求
         */
        void loadLocationMessage();

        /**
         * 上传位置信息
         */
        void upLocationMessage();

        /**
         * 上传联系人信息
         */
        void upContactsMessage();
    }
}
