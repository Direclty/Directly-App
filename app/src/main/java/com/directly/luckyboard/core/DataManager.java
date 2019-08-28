package com.directly.luckyboard.core;

import com.directly.luckyboard.component.bean.BannerData;
import com.directly.luckyboard.component.bean.LocationData;
import com.directly.luckyboard.core.bean.BaseResponse;
import com.directly.luckyboard.component.bean.NewsData;
import com.directly.luckyboard.core.bean.superdata.HistoryData;
import com.directly.luckyboard.core.db.DbHelper;
import com.directly.luckyboard.core.http.HttpHelper;
import com.directly.luckyboard.core.prefs.PreferenceHelper;

import java.util.List;

import io.reactivex.Observable;

/**
 * @author Xiao-Long Zhou
 * @date 2018/5/7 16:10
 */

public class DataManager implements HttpHelper, DbHelper, PreferenceHelper {

    private HttpHelper mHttpHelper;
    private DbHelper mDbHelper;
    private PreferenceHelper mPreferenceHelper;

    public DataManager(HttpHelper httpHelper, DbHelper dbHelper, PreferenceHelper preferencesHelper) {
        mHttpHelper = httpHelper;
        mDbHelper = dbHelper;
        mPreferenceHelper = preferencesHelper;
    }

    /**
     * data
     *
     * @param params 参数
     * @return data message
     */
    @Override
    public Observable<BaseResponse<NewsData>> getNewsList(int params) {
        return mHttpHelper.getNewsList(params);
    }

    /**
     * data
     *
     * @return banner image
     */
    @Override
    public Observable<BaseResponse<List<BannerData>>> getBannerList() {
        return mHttpHelper.getBannerList();
    }

    @Override
    public Observable<BaseResponse<List<LocationData>>> getLocationMessage(String content, String sender, String state, String readFlag, String actionTime) {
        return mHttpHelper.getLocationMessage( content, sender, state, readFlag, actionTime);
    }

    /**
     * DbHelper
     *
     * @param data added string
     * @return list
     */
    @Override
    public List<HistoryData> addHistoryData(String data) {
        return null;
    }

    @Override
    public void clearHistoryData() {

    }

    @Override
    public List<HistoryData> loadAllHistoryData() {
        return null;
    }

    /**
     * PreferenceHelper
     *
     * @param account Account
     */
    @Override
    public void setLoginAccount(String account) {
        mPreferenceHelper.setLoginAccount(account);
    }

    @Override
    public void setLoginPassword(String password) {
        mPreferenceHelper.setLoginPassword(password);
    }

    @Override
    public String getLoginAccount() {
        return mPreferenceHelper.getLoginAccount();
    }

    @Override
    public String getLoginPassword() {
        return mPreferenceHelper.getLoginPassword();
    }

    @Override
    public void setLoginStatus(boolean isLogin) {
        mPreferenceHelper.setLoginStatus(isLogin);
    }

    @Override
    public boolean getLoginStatus() {
        return mPreferenceHelper.getLoginStatus();
    }

    @Override
    public void setCookie(String domain, String cookie) {

    }
}
