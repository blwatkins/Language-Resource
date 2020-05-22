package ducks;

import behavior.fly.NoFly;
import behavior.noise.QuackNoise;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        setFlyBehavior(new NoFly());
        setNoiseBehavior(new QuackNoise());
    }
}
