package com.patterns.decorator.first_example.beverage;

public abstract class Beverage {
    protected String description;
    BeverageSize size;

    public abstract float cost();

    public String getDescription() {
        return description;
    }

    public BeverageSize getSize() {
        return size;
    }

    public enum BeverageSize {
        SMALL, MEDIUM, LARGE
    }
}