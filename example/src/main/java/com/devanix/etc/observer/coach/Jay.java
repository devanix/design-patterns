package com.devanix.etc.observer.coach;

public class Jay implements Crew {

    @Override
    public void update(String msg) {
        System.out.println("Jay 수신: " + msg);
    }
}
