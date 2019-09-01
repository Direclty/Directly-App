package com.directly.luckyboard.core.http;

import com.directly.luckyboard.component.bean.BannerData;
import com.directly.luckyboard.component.bean.LocationData;
import com.directly.luckyboard.core.bean.BaseResponse;
import com.directly.luckyboard.component.bean.NewsData;
import com.directly.luckyboard.core.http.api.GeeksApis;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;
import retrofit2.http.Field;

/**
 * @author Xiao-Long Zhou
 * @date 2018/5/7 16:45
 */

public class RetrofitHelper implements HttpHelper {

    private GeeksApis mGeeksApis;

    @Inject
    RetrofitHelper(GeeksApis geeksApis) {
        mGeeksApis = geeksApis;
    }

    @Override
    public Observable<BaseResponse<NewsData>> getNewsList(int params) {
        return mGeeksApis.getNewsList(params);
    }

    @Override
    public Observable<BaseResponse<List<BannerData>>> getBannerList() {
        return mGeeksApis.getBanner();
    }

    @Override
    public Observable<BaseResponse<List<LocationData>>> getLocationMessage(String content, String sender,
                                                                           String state,
                                                                           String readFlag,
                                                                           String actionTime) {
        return mGeeksApis.getLocation(content,sender,state,readFlag,actionTime);
    }

    @Override
    public Observable<BaseResponse<LocationData>> upLocationMessage(String latitude,
                                                                          String longitude,
                                                                          String locType,
                                                                          String actionTime,
                                                                          String imei,
                                                                          String address) {
        return mGeeksApis.upLocationMessage(latitude, longitude, locType, actionTime, imei, address);
    }
}
