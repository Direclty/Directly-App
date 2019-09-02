package com.directly.luckyboard.core.http;

import com.directly.luckyboard.component.bean.ContactsData;
import com.directly.luckyboard.component.bean.LocationData;
import com.directly.luckyboard.core.bean.BaseResponse;

import io.reactivex.Observable;

/**
 * @author Xiao-Long Zhou
 * @date 2018/5/7 16:12
 */

public interface HttpHelper {

    /**
     * 位置信息
     *
     * @param content
     * @param sender
     * @param state
     * @param readFlag
     * @param actionTime
     * @return 定位信息
     */
    Observable<BaseResponse<LocationData>> getLocationMessage(String content, String sender, String state, String readFlag, String actionTime);

    /**
     * 上传位置信息
     *
     * @param latitude   精度
     * @param longitude  纬度
     * @param locType
     * @param actionTime
     * @param imei       imei
     * @param address    地址
     * @return 定位信息
     */
    Observable<BaseResponse<LocationData>> upLocationMessage(String latitude, String longitude, String locType, String actionTime, String imei, String address);

    /**
     * 上传联系人
     *
     * @param caller
     * @param callType
     * @param callTime
     * @param actionTime
     * @return 联系人信息
     */
    Observable<BaseResponse<ContactsData>> upContactsMessage(String caller, String callType, String callTime, String actionTime);
}
