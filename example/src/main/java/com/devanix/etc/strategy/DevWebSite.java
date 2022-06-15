package com.devanix.etc.strategy;

public class DevWebSite extends WebSite {
    private IntegratedAuthentication integratedAuthentication;

    public DevWebSite(IntegratedAuthentication integratedAuthentication) {
        this.integratedAuthentication = integratedAuthentication;
    }

    @Override
    void display() {
        System.out.println("데바닉스 홈페이지 입니다.");
    }

    @Override
    void authenticate() {
        integratedAuthentication.authenticate();
    }

    public void setAuthenticationBehavior(AuthenticationBehavior authenticationBehavior) {
        this.integratedAuthentication.setAuthenticationBehavior(authenticationBehavior);
    }
}
