package com.directly.luckyboard.base.view;

/**
 * @author Xiao-Long Zhou
 * @date 2018/4/26 16:37
 */

public interface BaseView {
    /**
     * init something : like check network
     */
    void start();

    /**
     * loading view show
     */
    void showDialog();

    /**
     * error show
     *
     * @param isShowT    is show toast
     * @param isShowView is show error layout
     */
    void showErrorView(boolean isShowT, boolean isShowView);

    /**
     * loading dialog close
     */
    void dissMissDialog();

}
