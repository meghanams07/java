package com.mall.orion.hamleysImpl;

import com.mall.orion.orionRules.OrionRules;

public class HamleysImpl implements OrionRules {

    @Override
    public void doBusiness() {
        System.out.println("Hamleys offers toys and games for kids.");
    }
}