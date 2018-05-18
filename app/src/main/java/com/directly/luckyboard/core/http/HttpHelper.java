package com.directly.luckyboard.core.http;

import com.directly.luckyboard.core.bean.BaseResponse;
import com.directly.luckyboard.core.bean.news.NewsData;

import io.reactivex.Observable;


/**
 * @author Xiao-Long Zhou
 * @date 2018/5/7 16:12
 */

public interface HttpHelper {
    /**
     * 获取首页信息
     *
     * @param params 参数
     * @return New Message
     */
    Observable<BaseResponse<NewsData>> getNewsList(int params);
}
