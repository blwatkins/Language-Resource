package ducks;

import behavior.fly.NoFly;
import behavior.noise.SqueakNoise;

public class RubberDuck extends Duck {

    public RubberDuck() {
        setFlyBehavior(new NoFly());
        setNoiseBehavior(new SqueakNoise());
    }
}
