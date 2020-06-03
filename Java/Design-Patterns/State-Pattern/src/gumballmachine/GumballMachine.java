package gumballmachine;

import state.*;

public class GumballMachine {
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State soldOutState;
    private State currentState;
    private int gumballCount;

    public GumballMachine() {
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        currentState = soldOutState;
        gumballCount = 0;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public int getGumballCount() {
        return gumballCount;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void insertQuarter() {
        currentState.insertQuarter();
    }

    public void ejectQuarter() {
        currentState.ejectQuarter();
    }

    public void turnCrank() {
        currentState.turnCrank();
        currentState.dispense();
    }

    public void refill(int gumballCount) {
        this.gumballCount += gumballCount;
        currentState.refill();
    }

    public void releaseGumball() {

        if (gumballCount != 0) {
            gumballCount--;
        }
    }
}
