package gumballmachine;

import state.State;

public class GumballMachine {
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State soldOutState;
    private State currentState;
    private int gumballCount;

    public GumballMachine() {

    }

}
