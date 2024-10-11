package org.example.learning.Observable.Example2;

public class User implements ISubscriber{
    private int userId;

    public User(int userId) {
        this.userId = userId;
    }

    @Override
    public void notify(String msg) {
        System.out.println("User "+ userId +" recieved msg");
    }
}
