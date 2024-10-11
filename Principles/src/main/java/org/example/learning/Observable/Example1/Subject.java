package org.example.learning.Observable.Example1;

public interface Subject {

    // methods to register and unregister
    void register(Observer obj);
    void unregister(Observer obj);

    // method to notify observers of any change
    void notifyObservers();

    // method to get updates from subject
    Object getUpdate(Observer obj);
}
