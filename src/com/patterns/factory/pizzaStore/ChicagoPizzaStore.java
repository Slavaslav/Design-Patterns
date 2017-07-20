package com.patterns.factory.pizzaStore;

import com.patterns.factory.pizza.ChicagoStyleCheesePizza;
import com.patterns.factory.pizza.ChicagoStylePepperoniPizza;
import com.patterns.factory.pizza.ChicagoStyleVeggiePizza;
import com.patterns.factory.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza();

        } else if (type.equals("veggie")) {
            pizza = new ChicagoStyleVeggiePizza();
        }
        return pizza;
    }
}
