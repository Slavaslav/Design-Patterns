package com.patterns.decorator.first_example.beverage;

public class HouseBlend extends Beverage {
    public HouseBlend(BeverageSize size) {
        description = "HouseBlend";
        this.size = size;
    }

    @Override
    public float cost() {
        float cost = 0;
        if (size == BeverageSize.SMALL) {
            cost = 4.5f;
        } else if (size == BeverageSize.MEDIUM) {
            cost = 5f;
        } else if (size == BeverageSize.LARGE) {
            cost = 5.5f;
        }
        return cost;
    }
}