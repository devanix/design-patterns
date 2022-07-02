package com.devanix.etc.decorator.starbuzz;

public class StarBuzzCoffee {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        espresso = new Mocha(espresso);
        espresso = new Whip(espresso);

        System.out.println(espresso.getDescription() + " : " + espresso.cost());
    }
}
