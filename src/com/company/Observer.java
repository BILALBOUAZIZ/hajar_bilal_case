package com.company;
public abstract class Observer {
    protected Observable observable;

    public Observer() {
    }

    public abstract void update();
}
