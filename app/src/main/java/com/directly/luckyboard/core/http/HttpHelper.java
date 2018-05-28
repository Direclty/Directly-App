package com.directly.luckyboard.core.http;

import com.directly.luckyboard.component.bean.BannerData;
import com.directly.luckyboard.core.bean.BaseResponse;
import com.directly.luckyboard.component.bean.NewsData;

import java.util.List;

import io.reactivex.Observable;

/**
 * @author Xiao-Long Zhou
 * @date 2018/5/7 16:12
 */

public interface HttpHelper {
    /**
     * 获取首页信息
     *
     * @param params pages
     * @return New Message
     */
    Observable<BaseResponse<NewsData>> getNewsList(int params);

    /**
     * banner message
     *
     * @return banner's url
     */
    Observable<BaseResponse<List<BannerData>>> getBannerList();
}
