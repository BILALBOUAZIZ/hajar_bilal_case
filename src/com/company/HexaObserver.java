package com.company;

public class HexaObserver extends Observer {
    public HexaObserver(Observable observable) {
        this.observable = observable;
        this.observable.attach(this);
    }

    public void update() {
        System.out.println("Conversion en Hexadecimal: " + Integer.toHexString(this.observable.getState()).toUpperCase());
    }
}
