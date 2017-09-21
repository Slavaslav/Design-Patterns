package com.patterns.iterator;


import com.patterns.iterator.menu.BreakfastMenu;
import com.patterns.iterator.menu.DinnerMenu;
import com.patterns.iterator.menu.Menu;

import java.util.Iterator;

public class MenuIteratorTest {
    public static void main(String[] args) {
        Menu dinnerMenu = new DinnerMenu();
        Iterator<String> dinnerMenuIterator = dinnerMenu.getIterator();

        Menu breakfastMenu = new BreakfastMenu();
        Iterator<String> breakfastMenuIterator = breakfastMenu.getIterator();

        printMenu(dinnerMenuIterator, breakfastMenuIterator);
    }

    private static void printMenu(Iterator... iterators) {
        for (Iterator iterator : iterators) {
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }
}