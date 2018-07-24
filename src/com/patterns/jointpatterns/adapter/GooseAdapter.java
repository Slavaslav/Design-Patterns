package com.patterns.jointpatterns.adapter;


import com.patterns.jointpatterns.honkable.Goose;
import com.patterns.jointpatterns.observer.Observable;
import com.patterns.jointpatterns.observer.Observer;
import com.patterns.jointpatterns.quackable.Quackable;

public class GooseAdapter implements Quackable {
    private final Goose goose;
    private final Observable observable;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk();
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
        return "Goose pretending to be a Duck";
    }
}