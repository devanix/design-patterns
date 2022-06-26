package com.devanix.etc.strategy;

import com.devanix.etc.strategy.tech.OwnerBase;
import com.devanix.etc.strategy.type.OTPType;

public class OTP extends Authentication{

    public OTP() {
        setTech(new OwnerBase());
        setType(new OTPType());
    }
    @Override
    void authTech() {

    }

    @Override
    void authType() {

    }
}
