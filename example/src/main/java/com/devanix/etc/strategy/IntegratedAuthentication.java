package com.devanix.etc.strategy;

/**
 * 통합 인증 클래스
 */
public class IntegratedAuthentication {
    AuthenticationBehavior authenticationBehavior;

    public IntegratedAuthentication(AuthenticationBehavior authenticationBehavior) {
        this.authenticationBehavior = authenticationBehavior;
    }

    public void setAuthenticationBehavior(AuthenticationBehavior authenticationBehavior) {
        this.authenticationBehavior = authenticationBehavior;
    }

    public void authenticate() {
        this.authenticationBehavior.authenticate();
    }

    public void getAuthentication() {

    }
}
