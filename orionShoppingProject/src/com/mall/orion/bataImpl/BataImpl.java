package com.mall.orion.bataImpl;

import com.mall.orion.orionRules.OrionRules;

public class BataImpl implements OrionRules {

    @Override
    public void doBusiness() {
        System.out.println("Bata sells footwear for everyone.");
    }
}