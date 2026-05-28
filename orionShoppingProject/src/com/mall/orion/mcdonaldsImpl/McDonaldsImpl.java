package com.mall.orion.mcdonaldsImpl;

import com.mall.orion.orionRules.OrionRules;

public class McDonaldsImpl implements OrionRules {

    @Override
    public void doBusiness() {
        System.out.println("McDonalds sells burgers and fries.");
    }
}