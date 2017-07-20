package com.patterns.decorator.first_example.beverage;

public class Espresso extends Beverage {
    public Espresso(BeverageSize size) {
        description = "Espresso";
        this.size = size;
    }

    @Override
    public float cost() {
        float cost = 0;
        if (size == BeverageSize.SMALL) {
            cost = 3.5f;
        } else if (size == BeverageSize.MEDIUM) {
            cost = 4f;
        } else if (size == BeverageSize.LARGE) {
            cost = 4.5f;
        }
        return cost;
    }

}