package com.devanix.etc.observer.ioserver;

public class IOserverMain {

    public static void main(String[] args) {
        Observable observable = new Observable();

        Graph graph = new Graph(observable);
        Display display = new Display(observable);

        observable.update("abc", 1);
        observable.update("def", 2);
        observable.update("ghi", 3);
    }
}
