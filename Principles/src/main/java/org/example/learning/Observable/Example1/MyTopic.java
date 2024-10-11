package org.example.learning.Observable.Example1;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject{

    private List<Observer> observers;
    private String message;
    private boolean changed;
    private final Object MUTEX = new Object();

    public MyTopic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer obj) {
        if(obj == null) throw new NullPointerException("Null Observer");
        synchronized (MUTEX) {
            if(!observers.contains(obj)) observers.add(obj);
        }
    }

    @Override
    public void unregister(Observer obj) {
        synchronized (MUTEX) {
            observers.remove(obj);
        }
    }

    @Override
    public void notifyObservers() {
        List<Observer> observerList = null;
        synchronized (MUTEX) {
            //synchronization is used to make sure any observer registered after message is received is not notified
            if(!changed)
                return;
            observerList = new ArrayList<>(this.observers);
            this.changed = false;
        }

        for (Observer obj: observerList) {
            obj.update();
        }
    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.message;
    }

    public void postMessage(String message) {
        this.message = message;
        this.changed = true;
        notifyObservers();
    }
}
