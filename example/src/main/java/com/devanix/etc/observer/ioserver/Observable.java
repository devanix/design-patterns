package com.devanix.etc.observer.ioserver;

import java.util.ArrayList;
import java.util.List;

interface IObserver {
    public void notify(Object data);
}

public class Observable {
    private List<IObserver> observers = new ArrayList<IObserver>();

    public void registObserver(IObserver obs) {
        observers.add(obs);
    }

    String[] table = {"a", "b", "c", "d", "e"};
    public void update(String data, int index) {
        table[index] = data;
        onUpdate();
    }

    private void onUpdate() {
        for (IObserver obs : observers) {
            obs.notify(table);
        }
    }
}

class Graph implements IObserver {
    public Graph(Observable observable) {
        observable.registObserver(this);
    }

    @Override
    public void notify(Object data) {
        String[] table = (String[]) data;
        System.out.println("Graph: ");
        for (int i=0; i<5; i++) {
            System.out.println(table[i]);
        }
    }
}

class Display implements IObserver {
    public Display(Observable observable) {
        observable.registObserver(this);
    }

    @Override
    public void notify(Object data) {
        String[] table = (String[]) data;
        System.out.println("Display: ");
        for (int i=0; i<5; i++) {
            System.out.println(table[i]);
        }
    }
}
