package com.devanix.etc.strategy.tech;

public class KnowBase implements AuthTech{

    private static final String TECH = "지식기반";

    @Override
    public void thisTech() {
        System.out.println(TECH);
    }
}
