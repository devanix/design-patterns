package com.devanix.etc.strategy;

import com.devanix.etc.strategy.tech.KnowBase;
import com.devanix.etc.strategy.type.IdPwType;

public class IdPw extends Authentication {

    public IdPw() {
        setTech(new KnowBase());
        setType(new IdPwType());
    }

    @Override
    public void authType() {
        authType.thisType();
    }

    @Override
    public void authTech() {
        authTech.thisTech();
    }
}
