package adapter;

import duck.Duck;
import turkey.Turkey;

public class TurkeyDuck implements Duck {
    private Turkey turkey;

    public TurkeyDuck(Turkey turkey) {
        this.turkey = turkey;
    }

    public void quack() {
        turkey.gobble();
    }

    public void fly() {
        turkey.fly();
    }
}
