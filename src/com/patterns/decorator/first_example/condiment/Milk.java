package com.patterns.decorator.first_example.condiment;

import com.patterns.decorator.first_example.beverage.Beverage;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
        description = "Milk";
    }

    @Override
    public float cost() {
        float cost = getBeverage().cost();
        if (getSize() == BeverageSize.SMALL) {
            cost += 0.3f;
        } else if (getSize() == BeverageSize.MEDIUM) {
            cost += 0.4f;
        } else if (getSize() == BeverageSize.LARGE) {
            cost += 0.5f;
        }
        return cost;
    }
}