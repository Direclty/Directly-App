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
        LocationContract.Presenter, LocationContract.View {

    private DataManager mDataManager;

    @Inject
    public LocationPresenter(DataManager dataManager) {
        super(dataManager);
        this.mDataManager = dataManager;
    }

    @Override
    public void start() {

    }

    @Override
    public void showDialog() {

    }

    @Override
    public void showErrorView() {

    }

    @Override
    public void showErrorMsg(String message) {

    }

    @Override
    public void closeDialog() {

    }

    @Override
    public void reload() {

    }

    @Override
    public void loadLocationView() {

    }

    @Override
    public void loadLocationMessage() {

        Observable<BaseResponse<List<LocationData>>> locationMessage
                = mDataManager.getLocationMessage("测试","13399858383","0","1","1573441871000");
        addSubscribe(locationMessage.subscribeWith(new BaseObserver<BaseResponse<List<LocationData>>>(mView) {
            @Override
            public void onNext(BaseResponse<List<LocationData>> listBaseResponse) {
                if("true".equals(listBaseResponse.success)){
                    android.util.Log.d("zxl","数据是多少 = " + listBaseResponse.getData().size());
                    mView.loadLocationView();
                }

            }
        }));
    }
}
