package ducks;

import behavior.fly.FlyBehavior;
import behavior.noise.NoiseBehavior;

public abstract class Duck {
    private FlyBehavior flyBehavior;
    private NoiseBehavior noiseBehavior;

    public void swim() {
        System.out.println("I am swimming!");
    }

    public void fly() {
        flyBehavior.fly();
    }

    public void makeNoise() {
        noiseBehavior.makeNoise();
    }
}
