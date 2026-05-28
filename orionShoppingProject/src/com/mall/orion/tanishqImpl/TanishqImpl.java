package com.mall.orion.tanishqImpl;

import com.mall.orion.orionRules.OrionRules;

public class TanishqImpl implements OrionRules {

    @Override
    public void doBusiness() {
        System.out.println("Tanishq sells gold and diamond jewellery.");
    }
}