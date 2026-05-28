package com.mall.orion.pizzaHutImpl;

import com.mall.orion.orionRules.OrionRules;

public class PizzaHutImpl implements OrionRules {

    @Override
    public void doBusiness() {
        System.out.println("Pizza Hut serves pizza and pasta.");
    }
}