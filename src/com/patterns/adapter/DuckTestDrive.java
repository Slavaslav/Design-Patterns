package com.patterns.adapter;

public class DuckTestDrive {
    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
        Duck duck = (Duck) turkeyAdapter;
        duck.fly();
        duck.quack();
    }
}
