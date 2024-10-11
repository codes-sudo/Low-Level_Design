package org.example.learning.State.Example2;

public class MediumState implements FanState{
    @Override
    public void handleRequest(Fan fan) {
        System.out.println("Fan turned on high.");
        fan.setState(new HighState());
    }
}
