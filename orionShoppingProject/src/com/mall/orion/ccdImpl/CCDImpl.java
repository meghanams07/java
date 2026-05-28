package com.mall.orion.ccdImpl;

import com.mall.orion.orionRules.OrionRules;

public class CCDImpl implements OrionRules {

    @Override
    public void doBusiness() {
        System.out.println("CCD provides coffee and snacks.");
    }
}