package com.mall.orion.tacoBellImpl;

import com.mall.orion.orionRules.OrionRules;

public class TacoBellImpl implements OrionRules {

    @Override
    public void doBusiness() {
        System.out.println("Taco Bell serves Mexican fast food.");
    }
}