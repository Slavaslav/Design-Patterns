package com.patterns.jointpatterns.quackable;

import com.patterns.jointpatterns.observer.Observable;
import com.patterns.jointpatterns.observer.Observer;

public class RedheadDuck implements Quackable {
    private final Observable observable;

    public RedheadDuck() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "RedheadDuck";
    }
}