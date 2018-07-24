package com.patterns.jointpatterns.factory.goose;

import com.patterns.jointpatterns.quackable.Quackable;

public abstract class AbstractGooseFactory {
    public abstract Quackable createGoose();
}