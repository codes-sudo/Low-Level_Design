package org.example.learning.State.Example2;

public class HighState implements FanState{
    @Override
    public void handleRequest(Fan fan) {
        System.out.println("Fan turned off.");
        fan.setState(new OffState());
    }
}
