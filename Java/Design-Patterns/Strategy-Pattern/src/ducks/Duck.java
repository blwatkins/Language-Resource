package ducks;

import behavior.fly.FlyBehavior;

public abstract class Duck {
    private FlyBehavior flyBehavior;

    public void swim() {
        System.out.println("I am swimming!");
    }

    public void fly() {
        flyBehavior.fly();
    }
}
