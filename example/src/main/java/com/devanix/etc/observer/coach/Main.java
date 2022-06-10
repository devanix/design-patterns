package com.devanix.etc.observer.coach;

public class Main {
    public static void main(String[] args) {
        Beadi beadi = new Beadi();

        Crew tiber = new Tiber();
        Jay jay = new Jay();
        Lewin lewin = new Lewin();

        beadi.subscribe(tiber);
        beadi.subscribe(jay);
        beadi.subscribe(lewin);

        beadi.action("나 밥먹었다.");
    }
}
