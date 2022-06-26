package com.devanix.etc.strategy.tech;

public class BioBase implements AuthTech{

    private static final String TECH = "생체기반";

    @Override
    public void thisTech() {
        System.out.println(TECH);
    }
}
