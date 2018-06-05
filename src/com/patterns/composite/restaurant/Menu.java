package com.patterns.composite.restaurant;


import com.patterns.composite.iterator.CompositeIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent {
    private final List<MenuComponent> menuComponents = new ArrayList<>();
    private final String name;
    private final String description;

    private Iterator<MenuComponent> menuComponentIterator = null;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");

        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        if (menuComponentIterator == null) {
            menuComponentIterator = new CompositeIterator(menuComponents.iterator());
        }
        return menuComponentIterator;
    }
}