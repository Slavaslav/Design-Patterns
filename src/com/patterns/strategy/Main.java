package com.patterns.strategy;


import com.patterns.strategy.Behavior.FlyWithWings;
import com.patterns.strategy.Behavior.Quack;

public class Main {
    public static void main(String[] args) {
        Duck duck = new RubberDuck();
        duck.setQuackBehavior(new Quack());
        duck.setFlyBehavior(new FlyWithWings());
        duck.display();
        duck.performQuack();
        duck.performFly();
    }
}