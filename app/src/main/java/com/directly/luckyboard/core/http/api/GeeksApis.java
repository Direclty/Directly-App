package com.directly.luckyboard.core.http.api;

import com.directly.luckyboard.component.bean.BannerData;
import com.directly.luckyboard.core.bean.BaseResponse;
import com.directly.luckyboard.component.bean.NewsData;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * @author Xiao-Long Zhou
 * @date 2018/5/7 16:47
 */

public interface GeeksApis {

    String HOST = "http://www.wanandroid.com/";

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


}
