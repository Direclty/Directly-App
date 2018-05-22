package com.directly.luckyboard.component.fragment.main;

import com.directly.luckyboard.app.Constants;
import com.directly.luckyboard.base.presenter.BasePresenter;
import com.directly.luckyboard.component.bean.BannerData;
import com.directly.luckyboard.core.DataManager;
import com.directly.luckyboard.core.bean.BaseResponse;
import com.directly.luckyboard.component.bean.NewsData;
import com.directly.luckyboard.utils.RxUtils;
import com.directly.luckyboard.widget.BaseObserver;

import java.util.HashMap;

import javax.inject.Inject;

import io.reactivex.Observable;


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
    public void loadNewListData() {

        String loginAccount = mDataManager.getLoginAccount();
        String loginPassword = mDataManager.getLoginPassword();
        boolean loginStatus = mDataManager.getLoginStatus();


        Observable<BaseResponse<NewsData>> newsList = mDataManager.getNewsList(0);
        Observable<BaseResponse<BannerData>> bannerList = mDataManager.getBannerList();

        addSubscribe(Observable.zip(newsList, bannerList, (newsDataBaseResponse, bannerDataBaseResponse) -> {
            HashMap<String, Object> map = new HashMap<>(3);
            map.put(Constants.NEWS_DATA, newsDataBaseResponse);
            map.put(Constants.BANNER_DATA, bannerDataBaseResponse);
            return map;
        }).compose(RxUtils.rxSchedulerHelper())
                .subscribeWith(new BaseObserver<HashMap<String, Object>>(mView) {

                    @Override
                    public void onNext(HashMap<String, Object> map) {

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
