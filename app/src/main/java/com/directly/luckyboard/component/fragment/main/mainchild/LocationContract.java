package com.directly.luckyboard.component.fragment.main.mainchild;

import com.directly.luckyboard.base.presenter.AbstractPresenter;
import com.directly.luckyboard.base.view.BaseView;

class LocationContract {
    interface View extends BaseView{
        /**
         * 数据请求完毕之后加载布局
         * @param data
         */
        void loadLocationView(String data);

        /**
         * 上传状态
         * @param s
         */
        void upLocationView(String s);
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
    }
}
