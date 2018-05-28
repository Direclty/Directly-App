package com.directly.luckyboard.base.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chad.library.adapter.base.BaseViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xiao-Long Zhou
 * @date 2018/5/28 14:56
 */

public abstract class BaseRvAdapter<T> extends RecyclerView.Adapter<BaseViewHolder> {

    private List<T> mData = new ArrayList<>();

    private int layoutId;


    private LayoutInflater layoutInflater;

    public BaseRvAdapter(int layoutId, Context context) {

        this.layoutId = layoutId;
        layoutInflater = LayoutInflater.from(context);
    }

    public void addData(List<T> data) {

        if (data != null && data.size() > 0) {
            mData.addAll(data);
        }
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BaseViewHolder(layoutInflater.inflate(layoutId, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder holder, int position) {
        convert(holder, mData, position);
    }

    @Override
    public int getItemCount() {

        if (mData != null && mData.size() > 0) {
            return mData.size();
        } else {
            return 0;
        }
    }

    /**
     * 数据绑定
     *
     * @param holder   holder
     * @param mData    数据
     * @param position 位置
     */
    protected abstract void convert(BaseViewHolder holder, List<T> mData, int position);
}
