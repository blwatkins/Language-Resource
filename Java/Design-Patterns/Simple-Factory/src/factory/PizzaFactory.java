package factory;

import pizza.*;

public class PizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza;

        if (type.equalsIgnoreCase("Cheese")) {
            pizza = new CheesePizza();
        } else if (type.equalsIgnoreCase("Pepperoni")) {
            pizza = new PepperoniPizza();
        } else {
            pizza = new VeggiePizza();
        }

        return pizza;
    }
}
