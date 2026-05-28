package com.mall.orion.nike;

import com.mall.orion.orionRules.OrionRules;

public class NikeImpl implements OrionRules {

    @Override
    public void doBusiness() {
        System.out.println("Nike sells sports shoes and apparel.");
    }
}