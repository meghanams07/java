package com.mall.orion.levisImpl;

import com.mall.orion.orionRules.OrionRules;

public class LevisImpl implements OrionRules {

    @Override
    public void doBusiness() {
        System.out.println("Levis specializes in denim wear.");
    }
}