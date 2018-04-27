package com.directly.luckyboard.dagger;

import javax.inject.Inject;

/**
 * @author Xiao-Long Zhou
 * @date 2018/4/27 16:39
 */

public class Factory {

    Product product;

    @Inject
    public Factory(Product product) {
        this.product = product;
    }
}
