package com.devanix.etc.strategy.type;

public class OTPType implements AuthType{

    @Override
    public void thisType() {
        System.out.println("OTP");
    }

    @Override
    public String toString() {
        return "Type Is OTP";
    }
}
