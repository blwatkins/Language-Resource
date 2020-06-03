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
        System.out.println("Ejecting Quarter");
        gumballMachine.setCurrentState(gumballMachine.getNoQuarterState());
    }

    public void turnCrank() {
        System.out.println("Turning Crank");
        gumballMachine.setCurrentState(gumballMachine.getSoldState());
    }

    public void dispense() {
        System.out.println("Cannot dispense a gumball until the crank is turned");
    }

    public void refill() {
        System.out.println("Gumball machine refilled");
    }
}
