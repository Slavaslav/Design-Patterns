package com.patterns.decorator.first_example.condiment;

import com.patterns.decorator.first_example.beverage.Beverage;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        super(beverage);
        description = "Whip";
    }

    @Override
    public float cost() {
        float cost = getBeverage().cost();
        if (getSize() == BeverageSize.SMALL) {
            cost += 1.8f;
        } else if (getSize() == BeverageSize.MEDIUM) {
            cost += 1.9f;
        } else if (getSize() == BeverageSize.LARGE) {
            cost += 2f;
        }
        return cost;
    }
}