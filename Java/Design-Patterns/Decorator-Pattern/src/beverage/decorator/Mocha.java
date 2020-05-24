package beverage.decorator;

import beverage.Beverage;

public class Mocha extends BeverageDecorator {

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double getCost() {
        return beverage.getCost() + 0.20;
    }
}
