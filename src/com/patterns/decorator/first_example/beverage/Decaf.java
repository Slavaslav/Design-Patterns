package com.patterns.decorator.first_example.beverage;

public class Decaf extends Beverage {
    public Decaf(BeverageSize size) {
        description = "Decaf";
        this.size = size;
    }

    @Override
    public float cost() {
        float cost = 0;
        if (size == BeverageSize.SMALL) {
            cost = 2.5f;
        } else if (size == BeverageSize.MEDIUM) {
            cost = 3f;
        } else if (size == BeverageSize.LARGE) {
            cost = 3.5f;
        }
        return cost;
    }
}