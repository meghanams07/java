package com.mall.orion.uniqlo;

import com.mall.orion.orionRules.OrionRules;

public class UNIQLOImpl implements OrionRules {

    @Override
    public void doBusiness() {
        System.out.println("UNIQLO sells trendy fashion wear.");
    }
}