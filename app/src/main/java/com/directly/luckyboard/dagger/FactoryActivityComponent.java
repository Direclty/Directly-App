package com.directly.luckyboard.dagger;

import dagger.Component;

/**
 * @author Xiao-Long Zhou
 * @date 2018/4/27 16:00
 */

@Component
public interface FactoryActivityComponent {
    /**
     * dagger message
     *
     * @param factoryActivity 上下文
     */
    void Inject(FactoryActivity factoryActivity);
}

