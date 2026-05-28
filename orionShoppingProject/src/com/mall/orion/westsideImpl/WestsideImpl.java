package com.mall.orion.westsideImpl
        ;

import com.mall.orion.orionRules.OrionRules;

public class WestsideImpl implements OrionRules {

    @Override
    public void doBusiness() {
        System.out.println("Westside sells modern clothing collections.");
    }
}