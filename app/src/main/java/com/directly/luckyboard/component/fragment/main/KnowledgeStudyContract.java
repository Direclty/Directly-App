package com.directly.luckyboard.component.fragment.main;

import com.directly.luckyboard.base.presenter.AbstractPresenter;
import com.directly.luckyboard.base.view.BaseView;

/**
 * @author Xiao-Long Zhou
 * @date 2018/5/17 14:35
 */

public class KnowledgeStudyContract {

    public interface View extends BaseView {
        /**
         * show Knowledge message
         */
        void showKnowledgeStudyMessage();
    }

    public interface Presenter extends AbstractPresenter<View> {

        /**
         * load knowledge message
         */
        void loadKnowledgeStudyList();
    }
}
