package com.patterns.jointpatterns.factory.goose;

import com.patterns.jointpatterns.adapter.GooseAdapter;
import com.patterns.jointpatterns.honkable.Goose;
import com.patterns.jointpatterns.quackable.Quackable;

public class GooseFactory extends AbstractGooseFactory {
    @Override
    public Quackable createGoose() {
        return new GooseAdapter(new Goose());
    }
}