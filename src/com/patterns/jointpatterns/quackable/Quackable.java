package com.patterns.jointpatterns.quackable;

import com.patterns.jointpatterns.observer.QuackObservable;

public interface Quackable extends QuackObservable {
    void quack();
}