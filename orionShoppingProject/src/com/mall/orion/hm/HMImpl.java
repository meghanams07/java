package com.mall.orion.hm;

import com.mall.orion.orionRules.OrionRules;

public class HMImpl implements OrionRules {

    @Override
    public void doBusiness() {
        System.out.println("H&M provides affordable fashion clothing.");
    }
}