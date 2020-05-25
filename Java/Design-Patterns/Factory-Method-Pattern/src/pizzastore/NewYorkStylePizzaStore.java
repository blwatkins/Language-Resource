package pizzastore;

import pizza.Pizza;
import pizza.newyorkstyle.*;

public class NewYorkStylePizzaStore extends PizzaStore {

    public Pizza createPizza(String type) {
        Pizza pizza;

        if (type.equalsIgnoreCase("cheese")) {
            pizza = new NewYorkStyleCheesePizza();
        } else {
            pizza = new NewYorkStylePepperoniPizza();
        }

        return pizza;
    }
}
