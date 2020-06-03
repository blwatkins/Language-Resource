package state;

import gumballmachine.GumballMachine;

public class SoldOutState extends State {

    public SoldOutState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    public void insertQuarter() {
        System.out.println("Gumball machine is sold out");
    }

    public void ejectQuarter() {
        System.out.println("Gumball machine is sold out");
    }

    public void turnCrank() {
        System.out.println("Gumball machine is sold out");
    }

    public void dispense() {
        System.out.println("Gumball machine is sold out");
    }

    public void refill() {

        if (gumballMachine.getGumballCount() > 0) {
            System.out.println("Gumball machine refilled");
            gumballMachine.setCurrentState(gumballMachine.getNoQuarterState());
        }
    }
}
