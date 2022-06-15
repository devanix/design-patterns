package com.devanix.etc.strategy;

public class PKIAuthentication implements AuthenticationBehavior {

    @Override
    public void authenticate() {
        System.out.println("PKI 인증 진행");
    }

    @Override
    public String getAuthentication() {
        return "PKI";
    }
}
