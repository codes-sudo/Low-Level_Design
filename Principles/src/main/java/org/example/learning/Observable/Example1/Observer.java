package org.example.learning.Observable.Example1;

public interface Observer {

    // method to update the observer, used by subject
    void update();

    // attach with subject to observer
    void setSubject(Subject obj);
}
