package org.example.learning.State.Example2;

public class LowState implements FanState{
    @Override
    public void handleRequest(Fan fan) {
        System.out.println("Fan turned on medium.");
        fan.setState(new MediumState());
    }
}
