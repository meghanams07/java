package com.mall.orion.rebok;

import com.mall.orion.orionRules.OrionRules;

public class ReebokImpl implements OrionRules {

    @Override
    public void doBusiness() {
        System.out.println("Reebok provides fitness and training products.");
    }
}