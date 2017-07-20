package com.patterns.factory;

import com.patterns.factory.pizza.Pizza;
import com.patterns.factory.pizzaStore.CaliforniaPizzaStore;
import com.patterns.factory.pizzaStore.PizzaStore;

public class Solution {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new CaliforniaPizzaStore();
        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println(pizza);
    }
}
