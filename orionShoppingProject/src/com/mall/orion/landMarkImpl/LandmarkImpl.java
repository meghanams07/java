package com.mall.orion.landMarkImpl;

import com.mall.orion.orionRules.OrionRules;

public class LandmarkImpl implements OrionRules {

    @Override
    public void doBusiness() {
        System.out.println("Landmark sells books and stationery.");
    }
}