package com.directly.luckyboard.component.activity.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.directly.luckyboard.R;
import com.directly.luckyboard.app.Constants;
import com.directly.luckyboard.base.activity.BaseActivity;
import com.directly.luckyboard.component.fragment.main.CollectFragment;
import com.directly.luckyboard.component.fragment.main.KnowledgeStudyFragment;
import com.directly.luckyboard.component.fragment.main.MainPagerFragment;
import com.directly.luckyboard.component.fragment.main.OmniselectorFragment;
import com.directly.luckyboard.component.fragment.main.ProjectFragment;
import com.directly.luckyboard.component.fragment.main.SettingFragment;

import java.util.ArrayList;

import butterknife.BindView;

/**
 * @author Xiao-Long Zhou
 * @date 2018/04/26
 */
public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.View {

    @BindView(R.id.common_toolbar_title_tv)
    TextView commonToolbarTitleTv;
    @BindView(R.id.common_toolbar)
    Toolbar commonToolbar;
    @BindView(R.id.fragment_group)
    FrameLayout fragmentGroup;
    @BindView(R.id.main_floating_action_btn)
    FloatingActionButton mainFloatingActionBtn;
    @BindView(R.id.nav_view)
    NavigationView navView;
    @BindView(R.id.bottom_navigation_view)
    BottomNavigationView bottomNavigationView;
    @BindView(R.id.drawer_layout)
    DrawerLayout drawerLayout;
    private ArrayList<Fragment> mFragments;
    private MainPagerFragment mMainPagerFragment;
    private int mLastFgIndex;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initInject() {
        getActivityAppComponent().inject(this);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mFragments = new ArrayList<>();
        if (savedInstanceState == null) {

            mPresenter.setNightModeState(false);
            mMainPagerFragment = MainPagerFragment.getInstance(false, null);
            mFragments.add(mMainPagerFragment);
            initData();
            init();
            switchFragment(Constants.TYPE_MAIN_PAGER);
        } else {
            bottomNavigationView.setSelectedItemId(R.id.tab_main_pager);
            mMainPagerFragment = MainPagerFragment.getInstance(true, null);
            mFragments.add(mMainPagerFragment);
            initData();
            init();
            switchFragment(Constants.TYPE_SETTING);
        }
    }

    /**
     * 切换fragment
     *
     * @param position 要显示的fragment的下标
     */
    private void switchFragment(int position) {

        if (position >= Constants.TYPE_COLLECT) {
            mainFloatingActionBtn.setVisibility(View.INVISIBLE);
            bottomNavigationView.setVisibility(View.INVISIBLE);
        } else {
            mainFloatingActionBtn.setVisibility(View.VISIBLE);
            bottomNavigationView.setVisibility(View.VISIBLE);
        }
        if (position >= mFragments.size()) {
            return;
        }
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        Fragment targetFg = mFragments.get(position);
        Fragment lastFg = mFragments.get(mLastFgIndex);
        mLastFgIndex = position;
        ft.hide(lastFg);
        if (!targetFg.isAdded()) {
            getSupportFragmentManager().beginTransaction().remove(targetFg).commit();
            ft.add(R.id.fragment_group, targetFg);
        }
        ft.show(targetFg);
        ft.commitAllowingStateLoss();
    }

    private void init() {

        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.tab_main_pager:
                    switchFragment(0);
                    break;
                case R.id.tab_knowledge_hierarchy:
                    switchFragment(1);
                    break;
                case R.id.tab_navigation:
                    switchFragment(2);
                    break;
                case R.id.tab_project:
                    switchFragment(3);
                    break;
                default:
                    break;
            }
            return true;
        });
    }

    /**
     * 初始化页面
     */
    private void initData() {

        KnowledgeStudyFragment studyFragment = KnowledgeStudyFragment.getInstance(null, null);
        OmniselectorFragment omniselectorFragment = OmniselectorFragment.getInstance(null, null);
        ProjectFragment mProjectFragment = ProjectFragment.getInstance(null, null);
        CollectFragment collectFragment = CollectFragment.getInstance(null, null);
        SettingFragment settingFragment = SettingFragment.getInstance(null, null);

        mFragments.add(studyFragment);
        mFragments.add(omniselectorFragment);
        mFragments.add(mProjectFragment);
        mFragments.add(collectFragment);
        mFragments.add(settingFragment);
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
    protected void initEventAndData() {

    }


    @Override
    public void showSwitchProject() {

    }

    @Override
    public void showSwitchNavigation() {

    }
}
