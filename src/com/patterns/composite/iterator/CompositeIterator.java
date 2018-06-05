package com.patterns.composite.iterator;


import com.patterns.composite.restaurant.Menu;
import com.patterns.composite.restaurant.MenuComponent;

import java.util.*;

public class CompositeIterator implements Iterator<MenuComponent> {
    private final Deque<Iterator<MenuComponent>> queue;

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        queue = new ArrayDeque<>();
        queue.add(iterator);
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public MenuComponent next() {
        MenuComponent menuComponent = null;
        while (!queue.isEmpty() && Objects.isNull(menuComponent)) {
            Iterator<MenuComponent> menuComponentIterator = queue.peekLast();

            try {
                menuComponent = menuComponentIterator.next();
            } catch (NoSuchElementException e) {
                // empty
            }

            if (Objects.isNull(menuComponent)) {
                queue.pollLast();
            }
        }

        if (Objects.nonNull(menuComponent) && menuComponent instanceof Menu) {
            queue.add(menuComponent.createIterator());
        }
        return menuComponent;
    }
}