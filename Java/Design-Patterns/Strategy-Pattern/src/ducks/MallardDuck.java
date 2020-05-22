package ducks;

import behavior.fly.WingFly;
import behavior.noise.QuackNoise;

public class MallardDuck extends Duck {

    public MallardDuck() {
        setFlyBehavior(new WingFly());
        setNoiseBehavior(new QuackNoise());
    }
}
