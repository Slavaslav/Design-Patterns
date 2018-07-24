package com.patterns.jointpatterns.decorator;

import com.patterns.jointpatterns.observer.Observer;
import com.patterns.jointpatterns.quackable.Quackable;

public class QuackCounter implements Quackable {
    private static int numberOfQuacks;
    private final Quackable duck;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }
}
