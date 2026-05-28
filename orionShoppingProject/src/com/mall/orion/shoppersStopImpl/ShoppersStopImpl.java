package com.mall.orion.shoppersStopImpl;

import com.mall.orion.orionRules.OrionRules;

public class ShoppersStopImpl implements OrionRules {

    @Override
    public void doBusiness() {
        System.out.println("Shoppers Stop offers branded fashion products.");
    }
}