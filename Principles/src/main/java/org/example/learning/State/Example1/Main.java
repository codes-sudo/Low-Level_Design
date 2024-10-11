package org.example.learning.State.Example1;

public class Main {
    public static void main(String[] args) {
        TvContext context = new TvContext();
        State Tvstart = new TvStartState();
        State TvStop = new TvStopState();

        context.setTvState(Tvstart);
        context.doAction();

        context.setTvState(TvStop);
        context.doAction();

        // referncing to itself
//        TvContext tvContext = new TvContext();
//        tvContext.setTvState(tvContext);
//        tvContext.doAction();
    }
}
