package com.devanix.etc.strategy;

public interface AuthenticationBehavior {
    public void authenticate();
    public String getAuthentication();
}
