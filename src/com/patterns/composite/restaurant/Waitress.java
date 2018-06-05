package com.patterns.composite.restaurant;

import java.util.Iterator;

public class Waitress {
    private final MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    public void printVegetarian() {
        System.out.println("\nVEGETARIAN MENU\n----");

        Iterator<MenuComponent> iterator = allMenus.createIterator();
        MenuComponent menuComponent;
        while ((menuComponent = iterator.next()) != null) {
            if (menuComponent instanceof MenuItem) {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            }
        }
    }
}