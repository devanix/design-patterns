package com.devanix.etc.decorator.starbuzz;

public class Milk extends CondimentDecorator{
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 스팀밀크";
    }
}
