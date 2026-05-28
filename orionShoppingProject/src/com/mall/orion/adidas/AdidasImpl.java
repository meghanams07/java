package com.mall.orion.adidas;

import com.mall.orion.orionRules.OrionRules;

public class AdidasImpl implements OrionRules {

    @Override
    public void doBusiness() {
        System.out.println("Adidas provides sportswear products.");
    }
}