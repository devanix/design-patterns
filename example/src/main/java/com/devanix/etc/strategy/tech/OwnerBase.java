package com.devanix.etc.strategy.tech;

public class OwnerBase implements AuthTech{

    private static final String TECH = "소유기반";

    @Override
    public void thisTech() {
        System.out.println(TECH);
    }
}
