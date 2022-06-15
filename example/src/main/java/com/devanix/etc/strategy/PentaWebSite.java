package com.devanix.etc.strategy;

public class PentaWebSite extends WebSite {
    IntegratedAuthentication integratedAuthentication;

    public PentaWebSite() {
        this(new IntegratedAuthentication(new PasswordAuthentication()));
    }

    public PentaWebSite(IntegratedAuthentication integratedAuthentication) {
        this.integratedAuthentication = integratedAuthentication;
    }

    @Override
    void display() {
        System.out.println("펜타시큐리티 홉페이지 입니다.");
    }

    @Override
    void authenticate() {
        integratedAuthentication.authenticate();
    }

    public void setAuthenticationBehavior(AuthenticationBehavior authenticationBehavior) {
        this.integratedAuthentication.setAuthenticationBehavior(authenticationBehavior);
    }

}
