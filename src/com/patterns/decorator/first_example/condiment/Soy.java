package com.patterns.decorator.first_example.condiment;

import com.patterns.decorator.first_example.beverage.Beverage;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        super(beverage);
        description = "Soy";
    }

    @Override
    public float cost() {
        float cost = getBeverage().cost();
        if (getSize() == BeverageSize.SMALL) {
            cost += 1.3f;
        } else if (getSize() == BeverageSize.MEDIUM) {
            cost += 1.4f;
        } else if (getSize() == BeverageSize.LARGE) {
            cost += 1.5f;
        }
        return cost;
    }
}