package state;

import gumballmachine.GumballMachine;

public class SoldState extends State {

    public SoldState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    public void insertQuarter() {
        System.out.println("Gumball dispensing already in progress");
    }

    public void ejectQuarter() {
        System.out.println("Crank has already been turned");
    }

    public void turnCrank() {
        System.out.println("Gumball dispensing already in progress");
    }

    public void dispense() {
        gumballMachine.releaseGumball();

        if (gumballMachine.getGumballCount() > 0) {
            gumballMachine.setCurrentState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Out of gumballs");
            gumballMachine.setCurrentState(gumballMachine.getSoldOutState());
        }
    }

    public void refill() {
        System.out.println("Gumball machine refilled");
    }
}
