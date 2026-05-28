package com.mall.orion.titanImpl;

import com.mall.orion.orionRules.OrionRules;

public class TitanImpl implements OrionRules {

    @Override
    public void doBusiness() {
        System.out.println("Titan specializes in watches.");
    }
}