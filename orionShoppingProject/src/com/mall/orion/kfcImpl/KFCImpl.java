package com.mall.orion.kfcImpl;

import com.mall.orion.orionRules.OrionRules;

public class KFCImpl implements OrionRules {

    @Override
    public void doBusiness() {
        System.out.println("KFC serves crispy fried chicken.");
    }
}