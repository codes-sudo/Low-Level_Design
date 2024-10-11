package org.example.learning.State.Example2;

public class Fan {
    private FanState currentState;

    public Fan() {
       this.currentState = new OffState();
    }

    public void setState(FanState fanState) {
        this.currentState = fanState;
    }

    public void request() {
        currentState.handleRequest(this);
    }
}
