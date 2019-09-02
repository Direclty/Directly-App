package com.directly.luckyboard.core.http.api;

import com.directly.luckyboard.component.bean.ContactsData;
import com.directly.luckyboard.component.bean.LocationData;
import com.directly.luckyboard.core.bean.BaseResponse;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * @author Xiao-Long Zhou
 * @date 2018/5/7 16:47
 */

public interface GeeksApis {

    String HOST_NEW = "http://120.79.32.45:8093/";

    /**
     * 获取定位消息
     *
     * @param content
     * @param sender
     * @param state
     * @param readFlag
     * @param actionTime
     * @return
     */
    @POST("message")
    @FormUrlEncoded
    Observable<BaseResponse<LocationData>> getLocation(@Field("content") String content,
                                                       @Field("sender") String sender,
                                                       @Field("state") String state,
                                                       @Field("readFlag") String readFlag,
                                                       @Field("actionTime") String actionTime);

    /**
     * 上传定位消息
     *
     * @param latitude   经度
     * @param longitude  维度
     * @param locType    来源
     * @param actionTime 时间戳
     * @param imei       IMEI
     * @param address    地址
     * @return 定位信息
     */
    @POST("message")
    @FormUrlEncoded
    Observable<BaseResponse<LocationData>> upLocationMessage(@Field("latitude") String latitude,
                                                             @Field("longitude") String longitude,
                                                             @Field("locType") String locType,
                                                             @Field("actionTime") String actionTime,
                                                             @Field("imei") String imei,
                                                             @Field("address") String address);

    /**
     * 上传联系人信息
     *
     * @param caller
     * @param callType
     * @param callTime
     * @param actionTime
     * @return 上传联系人信息
     */
    @POST("message")
    @FormUrlEncoded
    Observable<BaseResponse<ContactsData>> upContactsMessage(@Field("caller") String caller,
                                                             @Field("callType") String callType,
                                                             @Field("callTime") String callTime,
                                                             @Field("actionTime") String actionTime);
}
