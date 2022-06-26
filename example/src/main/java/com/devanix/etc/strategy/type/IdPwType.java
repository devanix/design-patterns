package com.devanix.etc.strategy.type;

public class IdPwType implements AuthType{

    @Override
    public void thisType() {
        System.out.println("IDPW");
    }

    @Override
    public String toString() {
        return "Type Is ID/PW";
    }
}
