package com.patterns.iterator.iterator;


import java.util.Iterator;
import java.util.function.Consumer;

public class DinnerMenuIterator<T> implements Iterator<T> {
    private T[] array;
    private int index = 0;

    public DinnerMenuIterator(T[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return index < array.length;
    }

    @Override
    public T next() {
        return array[index++];
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void forEachRemaining(Consumer action) {
        throw new UnsupportedOperationException();
    }
}
