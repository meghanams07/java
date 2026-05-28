package com.mall.orion.puma;

import com.mall.orion.orionRules.OrionRules;

public class PumaImpl implements OrionRules {
    @Override
    public void doBusiness() {
        System.out.println("Puma sells stylish sportswear and shoes.");
    }
}