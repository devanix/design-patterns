package com.devanix.etc.strategy;

public class PINAuthentication implements AuthenticationBehavior {

    @Override
    public void authenticate() {
        System.out.println("PIN 인증 진행");
    }

    @Override
    public String getAuthentication() {
        return "PIN";
    }
}
