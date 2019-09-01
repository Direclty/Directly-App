package com.directly.luckyboard.component.fragment.main.mainchild;

import com.directly.luckyboard.base.presenter.BasePresenter;
import com.directly.luckyboard.component.bean.LocationData;
import com.directly.luckyboard.core.DataManager;
import com.directly.luckyboard.core.bean.BaseResponse;
import com.directly.luckyboard.utils.RxUtils;
import com.directly.luckyboard.widget.BaseObserver;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;

/**
 * @author Long-Xiao zhou
 * @date 2019-08-26
 */
public class LocationPresenter extends BasePresenter<LocationContract.View> implements
        LocationContract.Presenter {

    private DataManager mDataManager;

    @Inject
    public LocationPresenter(DataManager dataManager) {
        super(dataManager);
        this.mDataManager = dataManager;
    }

    @Override
    public void loadLocationMessage() {
        Observable<BaseResponse<LocationData>> locationMessage
                = mDataManager.getLocationMessage("测试", "13399858383",
                "0","1", "1573441871000");
        addSubscribe(locationMessage
                .compose(RxUtils.rxSchedulerHelper())
                .subscribeWith(new BaseObserver<BaseResponse<LocationData>>
                        (mView,"",true) {
            @Override
            public void onNext(BaseResponse<LocationData> listBaseResponse) {
                if("true".equals(listBaseResponse.success)){
                    if(listBaseResponse.getData() != null){
                        android.util.Log.d("zxl","数据成功 = " + listBaseResponse.getData());
                        mView.loadLocationView(listBaseResponse.getData().toString());
                    }else {
                        mView.loadLocationView("请求msg : " + listBaseResponse.getErrorMessage());
                    }
                    android.util.Log.d("zxl","请求成功 数据为空 = ");
                }
            }
        }));
    }

    @Override
    public void upLocationMessage() {
        Observable<BaseResponse<LocationData>> upLocationMessage = mDataManager
                .upLocationMessage("29.4525160000",
                        "106.5214370000", "1",
                        "1573441771000", "2312131",
                        "石油路122");
        addSubscribe(upLocationMessage.compose(RxUtils.rxSchedulerHelper())
                .subscribeWith(new BaseObserver<BaseResponse<LocationData>>(mView) {
            @Override
            public void onNext(BaseResponse<LocationData> locationDataBaseResponse) {
                if("true".equals(locationDataBaseResponse.success)){
                    if(locationDataBaseResponse.getData() != null){
                        android.util.Log.d("zxl","上传地理信息 = "
                                + locationDataBaseResponse.getData().toString());
                        mView.upLocationView(locationDataBaseResponse.getData().toString());
                    }else {
                        mView.upLocationView("请求msg : " + locationDataBaseResponse.getErrorMessage());
                    }
                    android.util.Log.d("zxl","请求成功 上传地理信息成功 = ");
                }
            }
        }));
    }
}
