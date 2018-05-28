package com.directly.luckyboard.component.fragment.main;

import com.directly.luckyboard.app.Constants;
import com.directly.luckyboard.base.presenter.BasePresenter;
import com.directly.luckyboard.component.bean.BannerData;
import com.directly.luckyboard.core.DataManager;
import com.directly.luckyboard.core.bean.BaseResponse;
import com.directly.luckyboard.component.bean.NewsData;
import com.directly.luckyboard.utils.CommonUtils;
import com.directly.luckyboard.utils.RxUtils;
import com.directly.luckyboard.widget.BaseObserver;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.functions.BiFunction;


/**
 * @author Xiao-Long Zhou
 * @date 2018/5/17 14:16
 */

public class MainPagerPresenter extends BasePresenter<MainPagerContract.View> implements MainPagerContract.Presenter {

    private DataManager mDataManager;
    private boolean isRefresh = true;
    private int mCurrentPage;

    @Inject
    MainPagerPresenter(DataManager dataManager) {
        super(dataManager);
        this.mDataManager = dataManager;
    }

    @Override
    public void loadNewListDataAndBanner() {

        String loginAccount = mDataManager.getLoginAccount();
        String loginPassword = mDataManager.getLoginPassword();
        boolean loginStatus = mDataManager.getLoginStatus();

        Observable<BaseResponse<NewsData>> newsList = mDataManager.getNewsList(0);

        Observable<BaseResponse<List<BannerData>>> bannerList = mDataManager.getBannerList();

        addSubscribe(Observable.zip(newsList, bannerList, (newsDataBaseResponse, bannerDataBaseResponse) -> {
            HashMap<String, Object> map = new HashMap<>(3);
            map.put(Constants.NEWS_DATA, newsDataBaseResponse);
            map.put(Constants.BANNER_DATA, bannerDataBaseResponse);
            return map;
        }).compose(RxUtils.rxSchedulerHelper())
                .subscribeWith(new BaseObserver<HashMap<String, Object>>(mView) {

                    @Override
                    public void onNext(HashMap<String, Object> map) {

                        BaseResponse<NewsData> newsBaseResponse = CommonUtils.cast(map.get(Constants.NEWS_DATA));

                        if (newsBaseResponse.getErrorCode() == BaseResponse.SUCCESS) {

                        }

                        mView.showNewList(CommonUtils.cast(map.get(Constants.NEWS_DATA)));

                        mView.showBanner(CommonUtils.cast(map.get(Constants.BANNER_DATA)));
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        mView.showErrorView();
                    }

                    @Override
                    public void onComplete() {
                        super.onComplete();
                        mView.closeDialog();
                    }
                }));
    }

    @Override
    public void getBannerData() {

    }

    @Override
    public void autoRefresh() {

    }

    @Override
    public void loadMore() {

    }

    @Override
    public void detachView() {
        super.detachView();
    }

    @Override
    public void attachView(MainPagerContract.View view) {
        super.attachView(view);
    }
}
