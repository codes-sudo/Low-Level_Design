package org.example.learning.State.Example1;

public class TvStopState implements State{
    @Override
    public void doAction() {
        System.out.println("TV is Turned OFF");
    }
}
