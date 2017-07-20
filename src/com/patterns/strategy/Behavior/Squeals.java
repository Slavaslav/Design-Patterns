package com.patterns.strategy.Behavior;

public class Squeals implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeals");
    }
}
