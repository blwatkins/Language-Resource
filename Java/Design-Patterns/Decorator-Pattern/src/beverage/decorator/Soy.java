package beverage.decorator;

public class Soy extends BeverageDecorator {

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double getCost() {
        return beverage.getCost() + 0.15;
    }
}
