package com.patterns.iterator.menu;

import com.patterns.iterator.iterator.DinnerMenuIterator;

import java.util.Iterator;

public class DinnerMenu implements Menu {
    private String[] dinnerDishes;

    public DinnerMenu() {
        dinnerDishes = new String[5];
        dinnerDishes[0] = "dinnerDishes #1";
        dinnerDishes[1] = "dinnerDishes #2";
        dinnerDishes[2] = "dinnerDishes #3";
        dinnerDishes[3] = "dinnerDishes #4";
        dinnerDishes[4] = "dinnerDishes #5";
    }

    @Override
    public Iterator<String> getIterator() {
        return new DinnerMenuIterator<>(dinnerDishes);
    }
}