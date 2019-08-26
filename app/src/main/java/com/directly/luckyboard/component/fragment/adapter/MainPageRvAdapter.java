package com.directly.luckyboard.component.fragment.adapter;

import android.content.Context;
import android.view.View;

import com.chad.library.adapter.base.BaseViewHolder;
import com.directly.luckyboard.base.adapter.BaseRvAdapter;
import com.directly.luckyboard.component.bean.NewsData;

import java.util.List;

/**
 * @author Xiao-Long Zhou
 * @date 2018/5/28 15:20
 */

public class MainPageRvAdapter extends BaseRvAdapter<NewsData.DatasBean> {
    //zhouxiaolong modify for add click listener 2019-08-26 begin
    public OnItemClickListener onItemClickListener;
    public interface OnItemClickListener{
        void onItemClick(View v,int position);
    }
    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }
    //zhouxiaolong modify for add click listener 2019-08-26 end
    public MainPageRvAdapter(int layoutId, Context mContext) {
        super(layoutId, mContext);
    }

    @Override
    protected void convert(BaseViewHolder holder, List<NewsData.DatasBean> mData, int position) {
        //zhouxiaolong modify for add click listener 2019-08-26 begin
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(onItemClickListener != null){
                    onItemClickListener.onItemClick(v,position);
                }
            }
        });
        //zhouxiaolong modify for add click listener 2019-08-26 end
    }
}
