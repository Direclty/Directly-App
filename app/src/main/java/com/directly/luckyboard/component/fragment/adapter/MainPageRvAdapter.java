package com.directly.luckyboard.component.fragment.adapter;

import android.content.Context;

import com.chad.library.adapter.base.BaseViewHolder;
import com.directly.luckyboard.base.adapter.BaseRvAdapter;
import com.directly.luckyboard.component.bean.NewsData;

import java.util.List;

/**
 * @author Xiao-Long Zhou
 * @date 2018/5/28 15:20
 */

public class MainPageRvAdapter extends BaseRvAdapter<NewsData.DatasBean> {

    public MainPageRvAdapter(int layoutId, Context mContext) {
        super(layoutId, mContext);
    }

    @Override
    protected void convert(BaseViewHolder holder, List<NewsData.DatasBean> mData, int position) {

    }
}
