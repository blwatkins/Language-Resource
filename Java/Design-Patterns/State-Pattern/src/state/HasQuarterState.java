package state;

import gumballmachine.GumballMachine;

public class HasQuarterState extends State {

    public HasQuarterState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    public void insertQuarter() {
        System.out.println("Machine already has a quarter");
    }

    public void ejectQuarter() {

    }

    public void turnCrank() {

    }

    public void dispense() {
        System.out.println("Cannot dispense a gumball until the crank is turned");
    }

    public void refill() {
        System.out.println("Gumball machine refilled");
    }
}
