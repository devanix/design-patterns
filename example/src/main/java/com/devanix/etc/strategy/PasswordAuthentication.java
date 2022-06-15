package com.devanix.etc.strategy;

public class PasswordAuthentication implements AuthenticationBehavior {

    @Override
    public void authenticate() {
        System.out.println("비밀번호 인증 진행");
    }

    @Override
    public String getAuthentication() {
        return "IDPW";
    }
}
