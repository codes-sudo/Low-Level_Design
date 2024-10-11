package org.example.learning.State.Example1;

public class TvContext {

    private State tvState;

    public State getTvState() {
        return tvState;
    }

    public void setTvState(State tvState) {
        this.tvState = tvState;
    }


    public void doAction() {
        this.tvState.doAction();
    }
}
