package com.devanix.etc.strategy;

import com.devanix.etc.strategy.tech.AuthTech;
import com.devanix.etc.strategy.type.AuthType;

public abstract class Authentication {

    AuthTech authTech;
    AuthType authType;

    public void setTech(AuthTech tech) {
        authTech = tech;
    }

    public void setType(AuthType type) {
        authType = type;
    }

    public AuthType getType() {
        return this.authType;
    }

    public AuthTech getTech() {
        return this.authTech;
    }

    abstract void authType();
    abstract void authTech();
}
