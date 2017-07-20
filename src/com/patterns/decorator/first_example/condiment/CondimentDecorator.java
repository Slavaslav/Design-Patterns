package com.patterns.decorator.first_example.condiment;

import com.patterns.decorator.first_example.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    private Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public BeverageSize getSize() {
        return beverage.getSize();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " " + super.getDescription();
    }
}