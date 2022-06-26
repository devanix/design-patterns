package com.devanix.etc.strategy;

import com.devanix.etc.strategy.tech.AuthTech;
import com.devanix.etc.strategy.type.AuthType;
import com.devanix.etc.strategy.type.OTPType;

public class AuthMain {

    public static void main(String[] args) {
        IdPw idpw = new IdPw();
        idpw.authType();
        idpw.authTech();
        AuthTech nowTech = idpw.getTech();
        System.out.println(nowTech.toString());
        AuthType nowType = idpw.getType();
        System.out.println(nowType.toString());

        idpw.authTech.thisTech();

        OTP otp = new OTP();

        otp.authType.thisType();
        otp.authTech.thisTech();
    }
}
