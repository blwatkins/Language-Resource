package state;

import gumballmachine.GumballMachine;

public class NoQuarterState extends State {

    public NoQuarterState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    public void insertQuarter() {

    }

    public void ejectQuarter() {
        System.out.println("No quarter was inserted into the machine");
    }

    public void turnCrank() {
        System.out.println("No quarter was inserted into the machine");
    }

    public void dispense() {
        System.out.println("Cannot dispense gumball. No quarter was inserted into the machine");
    }
}
