package beverage.decorator;

import beverage.Beverage;

public class Soy extends BeverageDecorator {

    public Soy(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double getCost() {
        return beverage.getCost() + 0.15;
    }
}
