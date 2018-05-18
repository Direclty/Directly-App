package com.directly.luckyboard.di.component;

import android.app.Activity;

import com.directly.luckyboard.component.fragment.main.CollectFragment;
import com.directly.luckyboard.component.fragment.main.KnowledgeStudyContract;
import com.directly.luckyboard.component.fragment.main.KnowledgeStudyFragment;
import com.directly.luckyboard.component.fragment.main.MainPagerFragment;
import com.directly.luckyboard.component.fragment.main.OmniselectorFragment;
import com.directly.luckyboard.component.fragment.main.ProjectFragment;
import com.directly.luckyboard.component.fragment.main.SettingFragment;
import com.directly.luckyboard.di.module.FragmentModule;
import com.directly.luckyboard.di.scope.FragmentScope;

import dagger.Component;

/**
 * @author quchao
 * @date 2017/11/27
 */

@FragmentScope
@Component(dependencies = AppComponent.class, modules = FragmentModule.class)
public interface FragmentComponent {

    /**
     * 获取Activity实例
     *
     * @return Activity
     */
    Activity getActivity();

    /**
     * 注入MainPagerFragment所需的依赖
     *
     * @param mainPagerFragment MainPagerFragment
     */
    void inject(MainPagerFragment mainPagerFragment);

    /**
     * 注入KnowledgeHierarchyListFragment所需的依赖
     *
     * @param knowledgeStudyFragment KnowledgeHierarchyListFragment
     */
    void inject(KnowledgeStudyFragment knowledgeStudyFragment);

    /**
     * 注入VideoFrequencyFragment所需的依赖
     *
     * @param projectFragment ProjectFragment
     */
    void inject(ProjectFragment projectFragment);

    /**
     * 注入omniselectorFragment所需要的依赖
     *
     * @param omniselectorFragment omniselectorFragment
     */
    void inject(OmniselectorFragment omniselectorFragment);

    /**
     * 注入CollectFragment所需的依赖
     *
     * @param collectFragment CollectFragment
     */
    void inject(CollectFragment collectFragment);

    /**
     * 注入SettingFragment所需的依赖
     *
     * @param settingFragment SettingFragment
     */
    void inject(SettingFragment settingFragment);
//
//    /**
//     * 注入NewsFragment所需的依赖
//     *
//     * @param navigationFragment NavigationFragment
//     */
//    void inject(NavigationFragment navigationFragment);
//
//    /**
//     * 注入ProjectListFragment所需的依赖
//     *
//     * @param projectListFragment ProjectListFragment
//     */
//    void inject(ProjectListFragment projectListFragment);
//
//    /**
//     * 注入ProjectListFragment所需的依赖
//     *
//     * @param searchDialogFragment SearchDialogFragment
//     */
//    void inject(SearchDialogFragment searchDialogFragment);
//
//    /**
//     * 注入UsageDialogFragment所需的依赖
//     *
//     * @param usageDialogFragment UsageDialogFragment
//     */
//    void inject(UsageDialogFragment usageDialogFragment);

//

}
