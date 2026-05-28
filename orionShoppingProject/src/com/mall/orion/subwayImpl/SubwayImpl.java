package com.mall.orion.subwayImpl;

import com.mall.orion.orionRules.OrionRules;

public class SubwayImpl implements OrionRules {

    @Override
    public void doBusiness() {
        System.out.println("Subway prepares fresh sandwiches.");
    }
}