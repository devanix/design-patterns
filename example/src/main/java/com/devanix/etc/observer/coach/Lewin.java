package com.devanix.etc.observer.coach;

public class Lewin implements Crew {

    @Override
    public void update(String msg) {
        System.out.println("Lewin 수신: " + msg);
    }
}
