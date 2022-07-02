package com.devanix.etc.decorator.starbuzz;

public abstract class Beverage {
    String description = "null";

    public String getDescription(){
        return this.description;
    }

    public abstract double cost();
}
