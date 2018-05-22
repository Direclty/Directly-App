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
     */
    void showErrorView();

    /**
     * show error message
     *
     * @param message content
     */
    void showErrorMsg(String message);

    /**
     * loading dialog close
     */
    void closeDialog();

    /**
     * Reload
     */
    void reload();

}
