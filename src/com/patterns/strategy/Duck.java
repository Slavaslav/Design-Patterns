package com.patterns.strategy;

import com.patterns.strategy.Behavior.FlyBehavior;
import com.patterns.strategy.Behavior.QuackBehavior;

/**
 * Abstract superclass Duck that can be inherited.
 */

public abstract class Duck {
    /**
     * Link to the type of behavior interface is flight.
     */
    private FlyBehavior flyBehavior;
    /**
     * The link to the type of behavior interface is quack.
     */
    private QuackBehavior quackBehavior;

    /**
     * Delegating a flight operation to classes of behavior.
     */
    public void performFly() {
        flyBehavior.fly();
    }

    /**
     * Delegating a quack operation to classes of behavior.
     */
    public void performQuack() {
        quackBehavior.quack();
    }

    /**
     * Setter for setting the value in the field of the flight behavior interface.
     */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    /**
     * Setter for setting the value in the field of the quack behavior interface.
     */
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    /**
     * Abstract method for displaying a duck.
     */
    abstract void display();
}