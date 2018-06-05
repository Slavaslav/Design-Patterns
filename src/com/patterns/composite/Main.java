package com.patterns.composite;


import com.patterns.composite.restaurant.Menu;
import com.patterns.composite.restaurant.MenuComponent;
import com.patterns.composite.restaurant.MenuItem;
import com.patterns.composite.restaurant.Waitress;

public class Main {
    public static void main(String[] args) {
        MenuComponent menuComponent1 = new Menu("Menu1", "Menu1 description");
        menuComponent1.add(new MenuItem("MenuItem1.1", "MenuItem1.1 description", true, 1.01));

        MenuComponent menuComponent2 = new Menu("Menu2", "Menu2 description");
        menuComponent2.add(new MenuItem("MenuItem2.1", "MenuItem2.1 description", true, 2.02));

        MenuComponent menuComponent3 = new Menu("Menu3", "Menu3 description");
        menuComponent3.add(new MenuItem("MenuItem3.1", "MenuItem3.1 description", true, 3.03));
        menuComponent3.add(new MenuItem("MenuItem3.2", "MenuItem3.2 description", false, 3.04));

        menuComponent2.add(menuComponent3);

        MenuComponent menuComponent4 = new Menu("Menu4", "Menu4 description");
        menuComponent4.add(new MenuItem("MenuItem4.1", "MenuItem4.1 description", true, 4.04));
        menuComponent4.add(new MenuItem("MenuItem4.2", "MenuItem4.2 description", false, 4.05));

        MenuComponent allMenus = new Menu("All menus", "All menus description");
        allMenus.add(menuComponent1);
        allMenus.add(menuComponent2);
        allMenus.add(menuComponent4);

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
        waitress.printVegetarian();
    }
}