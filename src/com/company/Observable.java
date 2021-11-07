package com.company;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Observable {
    private List<Observer> observers = new ArrayList();
    private int state;

    public Observable() {
    }

    public int getState() {
        return this.state;
    }

    public void setState(int state) {
        this.state = state;
        this.notifyAllObservers();
    }

    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    public void notifyAllObservers() {
        Iterator var2 = this.observers.iterator();

        while(var2.hasNext()) {
            Observer observer = (Observer)var2.next();
            observer.update();
        }

    }
}
