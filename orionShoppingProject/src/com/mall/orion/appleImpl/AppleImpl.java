package com.mall.orion.appleImpl;

import com.mall.orion.orionRules.OrionRules;

public class AppleImpl implements OrionRules {

    @Override
    public void doBusiness() {
        System.out.println("Apple sells premium electronic gadgets.");
    }
}