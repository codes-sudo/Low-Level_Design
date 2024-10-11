package org.example.learning.State.Example1;

public class TvStartState implements State{
    @Override
    public void doAction() {
        System.out.println("TV is turned ON");
    }
}
