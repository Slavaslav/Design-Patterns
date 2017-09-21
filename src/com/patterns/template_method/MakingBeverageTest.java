package com.patterns.template_method;

public class MakingBeverageTest {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();

        Tea tea = new Tea();
        tea.prepareRecipe();
    }
}
