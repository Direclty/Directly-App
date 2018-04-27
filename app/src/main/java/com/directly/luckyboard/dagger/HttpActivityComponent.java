package com.directly.luckyboard.dagger;

import dagger.Component;

/**
 * @author Xiao-Long Zhou
 * @date 2018/4/27 16:50
 */

@Component(modules = HttpActivityModule.class)
public interface HttpActivityComponent {
    void Inject(HttpActivity httpActivity);
}
