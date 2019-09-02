package com.directly.luckyboard.core.http;

import com.directly.luckyboard.component.bean.ContactsData;
import com.directly.luckyboard.component.bean.LocationData;
import com.directly.luckyboard.core.bean.BaseResponse;
import com.directly.luckyboard.core.http.api.GeeksApis;

import javax.inject.Inject;

import io.reactivex.Observable;

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
    public Observable<BaseResponse<LocationData>> getLocationMessage(String content, String sender,
                                                                     String state,
                                                                     String readFlag,
                                                                     String actionTime) {
        return mGeeksApis.getLocation(content, sender, state, readFlag, actionTime);
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

    @Override
    public Observable<BaseResponse<ContactsData>> upContactsMessage(String caller,
                                                                    String callType,
                                                                    String callTime,
                                                                    String actionTime) {
        return mGeeksApis.upContactsMessage(caller, callType, callTime, actionTime);
    }
}
