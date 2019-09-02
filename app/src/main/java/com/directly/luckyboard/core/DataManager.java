package com.directly.luckyboard.core;

import com.directly.luckyboard.component.bean.ContactsData;
import com.directly.luckyboard.component.bean.LocationData;
import com.directly.luckyboard.core.bean.BaseResponse;
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

    @Override
    public Observable<BaseResponse<LocationData>> getLocationMessage(String content, String sender, String state, String readFlag, String actionTime) {
        return mHttpHelper.getLocationMessage( content, sender, state, readFlag, actionTime);
    }

    @Override
    public Observable<BaseResponse<LocationData>> upLocationMessage(String latitude, String longitude, String locType, String actionTime, String imei, String address) {
        return mHttpHelper.upLocationMessage(latitude,longitude,locType,actionTime,imei,address);
    }

    @Override
    public Observable<BaseResponse<ContactsData>> upContactsMessage(String caller, String callType, String callTime, String actionTime) {
        return mHttpHelper.upContactsMessage(caller,callType,callTime,actionTime);
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
