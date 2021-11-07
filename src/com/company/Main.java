package com.company;
public class Main {

    public static void main(String[] args) {
        Observable observable = new Observable();
        new HexaObserver(observable);
        new OctalObserver(observable);
        new BinaryObserver(observable);
        System.out.println("Premier état: 20");
        observable.setState(15);
        System.out.println("Second état: 100");
        observable.setState(10);
    }
}
