package com.directly.luckyboard.component.fragment.main.mainchild;

import android.os.Bundle;
import android.support.v4.widget.Space;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.directly.luckyboard.R;
import com.directly.luckyboard.base.activity.BaseActivity;
import com.directly.luckyboard.component.bean.LocationData;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author Long-Xiao zhou
 * @date 2019-08-26
 */
public class LocationActivity extends BaseActivity<LocationPresenter> implements LocationContract.View {

    @BindView(R.id.loading_animation)
    LottieAnimationView loadingAnimation;
    @BindView(R.id.bt_location_message)
    Button btLocationMessage;
    @BindView(R.id.tv_location_content)
    TextView tvLocationContent;
    @BindView(R.id.bt_up_ld_msg)
    Button btUpLdMsg;
    @BindView(R.id.tv_up_ld_content)
    TextView tvUpLdContent;
    @BindView(R.id.loading_group)
    LinearLayout loadingGroup;

    @OnClick(R.id.bt_location_message )
    public void loadLocationMessage(){
        mPresenter.loadLocationMessage();
    }

    @OnClick(R.id.bt_up_ld_msg )
    public void upLocationMessage(){
        mPresenter.upLocationMessage();
    }

    //add the location activity 2019-08-27 begin
    @Override
    protected void initInject() {
        getActivityAppComponent().inject(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.loading_view;
    }
    //add the location activity 2019-08-27 begin

    @Override
    protected void initEventAndData() {

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
    public void loadLocationView(String msg) {
        tvLocationContent.setText(msg);
    }

    @Override
    public void upLocationView(String msg2) {
        tvUpLdContent.setText(msg2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
