package pizzastore;

import pizza.Pizza;
import pizza.chicagostyle.*;

public class ChicagoStylePizzaStore extends PizzaStore {

    public Pizza createPizza(String type) {
        Pizza pizza;

        if (type.equalsIgnoreCase("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else {
            pizza = new ChicagoStylePepperoniPizza();
        }

        return pizza;
    }
}
