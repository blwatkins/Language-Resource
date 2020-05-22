package ducks;

import behavior.fly.FlyBehavior;

public abstract class Duck {
    private FlyBehavior flyBehavior;

    public Duck(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void swim() {
        System.out.println("I am swimming!");
    }

    public void fly() {
        flyBehavior.fly();
    }
}
