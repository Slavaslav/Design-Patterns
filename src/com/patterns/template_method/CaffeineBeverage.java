package com.patterns.template_method;

public abstract class CaffeineBeverage {
    public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    abstract void brew();

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    abstract void addCondiments();
}