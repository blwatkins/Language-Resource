package state;

import gumballmachine.GumballMachine;

public class NoQuarterState implements State {
    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
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
