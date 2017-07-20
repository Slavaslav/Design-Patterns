package com.patterns.decorator.first_example;

import com.patterns.decorator.first_example.beverage.*;
import com.patterns.decorator.first_example.condiment.*;

public class Main {
    public static void main(String[] args) {
        Beverage darkRoast = new DarkRoast(Beverage.BeverageSize.SMALL);
        System.out.println(darkRoast.getDescription() + " " + darkRoast.cost());
        System.out.println();

        Beverage decaf = new Decaf(Beverage.BeverageSize.MEDIUM);
        CondimentDecorator milk = new Milk(decaf);
        CondimentDecorator mocha = new Mocha(milk);
        System.out.println(mocha.getDescription() + " " + mocha.cost());
        System.out.println();

        Beverage espresso = new Espresso(Beverage.BeverageSize.LARGE);
        CondimentDecorator whip = new Whip(espresso);
        System.out.println(whip.getDescription() + " " + whip.cost());
        System.out.println();

        Beverage houseBlend = new HouseBlend(Beverage.BeverageSize.SMALL);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Soy(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + " " + houseBlend.cost());
        System.out.println();
    }
}