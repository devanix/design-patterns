package com.devanix.etc.strategy;

public class UAFAuthenticate implements AuthenticationBehavior {

    @Override
    public void authenticate() {
        System.out.println("UAF 인증 진행");
    }

    @Override
    public String getAuthentication() {
        return "UAF";
    }
}
