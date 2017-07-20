package com.patterns.factory.pizzaStore;

import com.patterns.factory.pizza.CaliforniaStyleCheesePizza;
import com.patterns.factory.pizza.CaliforniaStylePepperoniPizza;
import com.patterns.factory.pizza.CaliforniaStyleVeggiePizza;
import com.patterns.factory.pizza.Pizza;

public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CaliforniaStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new CaliforniaStylePepperoniPizza();
        } else if (type.equals("veggie")) {
            pizza = new CaliforniaStyleVeggiePizza();
        }
        return pizza;
    }
}