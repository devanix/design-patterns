package com.devanix.etc.decorator.starbuzz;

public class SoyMilk extends CondimentDecorator{
    public SoyMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 두유";
    }
}
