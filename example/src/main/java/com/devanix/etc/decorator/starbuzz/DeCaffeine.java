package com.devanix.etc.decorator.starbuzz;

public class DeCaffeine extends Beverage{

    public DeCaffeine(){
        description = "디카페인";
    }

    public double cost() {
        return 1.05;
    }
}
