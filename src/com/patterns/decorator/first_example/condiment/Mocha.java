package com.patterns.decorator.first_example.condiment;

import com.patterns.decorator.first_example.beverage.Beverage;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        super(beverage);
        description = "Mocha";
    }

    @Override
    public float cost() {
        float cost = getBeverage().cost();
        if (getSize() == BeverageSize.SMALL) {
            cost += 0.8f;
        } else if (getSize() == BeverageSize.MEDIUM) {
            cost += 0.9f;
        } else if (getSize() == BeverageSize.LARGE) {
            cost += 1f;
        }
        return cost;
    }
}
