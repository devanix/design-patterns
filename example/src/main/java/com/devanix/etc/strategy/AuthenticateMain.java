package com.devanix.etc.strategy;

/**
 * 전략(Strategy) 패턴 샘플 예제 메인 클래스
 */
public class AuthenticateMain {

    public static void main(String[] args) {
        // 펜타 웹사이트 접속 및 PKI 인증 진행
        PentaWebSite pentaWebSite = new PentaWebSite();
        pentaWebSite.display();
        pentaWebSite.authenticate();


        // 펜타 인증방식 UAF로 변경
        pentaWebSite.setAuthenticationBehavior(new UAFAuthenticate());
        pentaWebSite.authenticate();

        // 데바닉스 웹사이트 접속 및 UAF 인증 진행
        DevWebSite devaWebSite = new DevWebSite(new IntegratedAuthentication(new UAFAuthenticate()));
        devaWebSite.display();
        devaWebSite.authenticate();

        // 데바닉스 PIN 인증 방식 변경
        devaWebSite.setAuthenticationBehavior(new PINAuthentication());
        devaWebSite.authenticate();
    }
}
