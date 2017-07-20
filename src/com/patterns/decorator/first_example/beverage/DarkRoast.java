package com.patterns.decorator.first_example.beverage;

public class DarkRoast extends Beverage {
    public DarkRoast(BeverageSize size) {
        description = "DarkRoast";
        this.size = size;
    }

    @Override
    public float cost() {
        float cost = 0;
        if (size == BeverageSize.SMALL) {
            cost = 1.5f;
        } else if (size == BeverageSize.MEDIUM) {
            cost = 2f;
        } else if (size == BeverageSize.LARGE) {
            cost = 2.5f;
        }
        return cost;
    }
}