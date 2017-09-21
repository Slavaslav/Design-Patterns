package com.patterns.iterator.menu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BreakfastMenu implements Menu {
    private List<String> breakfastDishes;

    public BreakfastMenu() {
        breakfastDishes = new ArrayList<>();
        breakfastDishes.add("breakfastDishes #1");
        breakfastDishes.add("breakfastDishes #2");
        breakfastDishes.add("breakfastDishes #3");
        breakfastDishes.add("breakfastDishes #4");
        breakfastDishes.add("breakfastDishes #5");
    }

    @Override
    public Iterator<String> getIterator() {
        return breakfastDishes.iterator();
    }
}