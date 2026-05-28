package com.mall.orion.starBUcksImpl;

import com.mall.orion.orionRules.OrionRules;

public class StarbucksImpl implements OrionRules {

    @Override
    public void doBusiness() {
        System.out.println("Starbucks offers premium coffee drinks.");
    }
}