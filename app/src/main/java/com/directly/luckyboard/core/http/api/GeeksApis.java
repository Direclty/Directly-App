package com.directly.luckyboard.core.http.api;

import com.directly.luckyboard.component.bean.BannerData;
import com.directly.luckyboard.component.bean.LocationData;
import com.directly.luckyboard.core.bean.BaseResponse;
import com.directly.luckyboard.component.bean.NewsData;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * @author Xiao-Long Zhou
 * @date 2018/5/7 16:47
 */

public interface GeeksApis {

    String HOST = "http://www.wanandroid.com/";

    String HOST_NEW = "http://120.79.32.45:8093/";

    /**
     * 获取新闻列表
     *
     * @param num 页数
     * @return 列表
     */
    @GET("article/list/{num}/json")
    Observable<BaseResponse<NewsData>> getNewsList(@Path("num") int num);

    /**
     * 获取新闻列表
     *
     * @return 列表
     */
    @GET("banner/json")
    Observable<BaseResponse<List<BannerData>>> getBanner();

    /**
     * 获取定位消息
     * @param content
     * @param sender
     * @param state
     * @param readFlag
     * @param actionTime
     *
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
     * @param latitude 经度
     * @param longitude 维度
     * @param locType 来源
     * @param actionTime 时间戳
     * @param imei IMEI
     * @param address 地址
     *
     * @return 定位信息
     */
    @POST("message")
    @FormUrlEncoded
    Observable<BaseResponse<LocationData>> upLocationMessage(@Field("latitude") String latitude,
                                                             @Field("longitude") String longitude,
                                                             @Field("locType") String locType,
                                                             @Field("actionTime") String actionTime,
                                                             @Field("imei") String imei,
                                                             @Field("address")String address);
}
