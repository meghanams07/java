package com.mall.orion.metroImpl;

import com.mall.orion.orionRules.OrionRules;

public class MetroImpl implements OrionRules {

    @Override
    public void doBusiness() {
        System.out.println("Metro offers stylish shoes and bags.");
    }
}