package com.patterns.factory.pizza;

public abstract class Pizza {
    String name, dough, sauce;

    public void prepare() {
        System.out.println("Prepare " + name);
    }

    public void bake() {
        System.out.println("Bake");
    }

    public void cut() {
        System.out.println("Cut");
    }

    public void box() {
        System.out.println("Box");
    }
}