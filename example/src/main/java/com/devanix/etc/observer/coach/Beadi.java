package com.devanix.etc.observer.coach;

import java.util.ArrayList;
import java.util.List;

public class Beadi implements Coach {
    private List<Crew> crews = new ArrayList<>();

    public void action(String msg) {
        notifyCrew(msg);
    }

    @Override
    public void subscribe(Crew crew) {
        crews.add(crew);
    }

    @Override
    public void unsubscribe(Crew crew) {
        int i = crews.indexOf(crew);
        if (i >= 0) {
            crews.remove(crew);
        }
    }

    @Override
    public void notifyCrew(String msg) {
        crews.forEach(crew -> crew.update(msg));
    }
}
