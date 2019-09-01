package com.directly.luckyboard.component.fragment.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.directly.luckyboard.R;
import com.directly.luckyboard.base.fragment.AbstractRootFragment;
import com.directly.luckyboard.component.bean.BannerData;
import com.directly.luckyboard.component.bean.NewsData;
import com.directly.luckyboard.component.fragment.adapter.MainPageRvAdapter;
import com.directly.luckyboard.component.fragment.main.mainchild.LocationActivity;
import com.directly.luckyboard.core.bean.BaseResponse;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * @author Xiao-Long Zhou
 * @date 2018/5/17 14:15
 */

public class MainPagerFragment extends AbstractRootFragment<MainPagerPresenter> implements MainPagerContract.View {


    @BindView(R.id.main_pager_recycler_view)
    RecyclerView mainPagerRecyclerView;

    @BindView(R.id.normal_view)
    SmartRefreshLayout normalView;

    MainPageRvAdapter mAdapter;
    @BindView(R.id.bt_test)
    Button btTest;
    Unbinder unbinder;

    @OnClick(R.id.bt_test)
    public void testMessage(){
        Intent intent = new Intent(getContext(), LocationActivity.class);
        startActivity(intent);
    }

    public static MainPagerFragment getInstance(boolean param1, String param2) {

        MainPagerFragment fragment = new MainPagerFragment();

        return fragment;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_main_pager;
    }

    @Override
    protected void initEventAndData() {
        super.initEventAndData();

        mPresenter.loadNewListDataAndBanner();

        mAdapter = new MainPageRvAdapter(R.layout.layout_item_host, getContext());
        mainPagerRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mainPagerRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public void start() {

    }

    @Override
    public void showDialog() {

    }

    @Override
    public void closeDialog() {

    }

    /**
     * @param data 首页数据
     */
    @Override
    public void showNewList(BaseResponse<NewsData> data) {

        List<NewsData.DatasBean> mData = data.getData().getDatas();

        mAdapter.addData(mData);
        //zhouxiaolong modify for add click listener 2019-08-26 begin
        mAdapter.setOnItemClickListener(new MainPageRvAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {
                Intent intent = new Intent(getContext(), LocationActivity.class);
                startActivity(intent);
            }
        });
        //zhouxiaolong modify for add click listener 2019-08-26 end
    }

    /**
     * @param data banner数据
     */
    @Override
    public void showBanner(BaseResponse<List<BannerData>> data) {

    }

    @Override
    public void showErrorView() {

    }

    @Override
    public void showErrorMsg(String message) {

    }

    @Override
    public void reload() {

    }

    @Override
    protected void initInject() {
        getFragmentComponent().inject(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
