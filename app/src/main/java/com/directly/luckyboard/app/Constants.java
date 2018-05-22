package com.directly.luckyboard.app;

import android.graphics.Color;

import java.io.File;

/**
 * @author Xiao-Long Zhou
 * @date 2018/5/8 10:02
 */

public class Constants {

    /**
     * Path
     */
    private static final String PATH_DATA = DirectlyApplication.getInstance().getCacheDir().getAbsolutePath() + File.separator + "data";

    /**
     * 缓存目录
     */
    public static final String PATH_CACHE = PATH_DATA + "/NetCache";

    /**
     * 数据库名称
     */
    static final String DB_NAME = "directly_android.db";


    /**
     * Shared Preference key
     */
    public static final String ACCOUNT = "account";

    public static final String PASSWORD = "password";

    public static final String LOGIN_STATUS = "login_status";

    public static final String AUTO_CACHE_STATE = "auto_cache_state";

    public static final String NO_IMAGE_STATE = "no_image_state";

    public static final String NIGHT_MODE_STATE = "night_mode_state";

    /**
     * Tag fragment classify
     */
    public static final int TYPE_MAIN_PAGER = 0;

    public static final int TYPE_KNOWLEDGE = 1;

    public static final int TYPE_NAVIGATION = 2;

    public static final int TYPE_PROJECT = 3;

    public static final int TYPE_COLLECT = 4;

    public static final int TYPE_SETTING = 5;

    /**
     * Tab colors
     */
    public static final int[] TAB_COLORS = new int[]{
            Color.parseColor("#90C5F0"),
            Color.parseColor("#91CED5"),
            Color.parseColor("#F88F55"),
            Color.parseColor("#C0AFD0"),
            Color.parseColor("#E78F8F"),
            Color.parseColor("#67CCB7"),
            Color.parseColor("#F6BC7E")
    };

    public static final String NEWS_DATA = "new_data";
    public static final String BANNER_DATA = "banner_data";
}
