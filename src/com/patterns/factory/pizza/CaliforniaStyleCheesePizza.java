package com.patterns.factory.pizza;

public class CaliforniaStyleCheesePizza extends Pizza {
    public CaliforniaStyleCheesePizza() {
        name = "CaliforniaStyleCheesePizza";
        dough = "dough";
        sauce = "sauce";
    }

    @Override
    public String toString() {
        return "CaliforniaStyleCheesePizza";
    }
}
