package pizzastore;

import factory.PizzaIngredientFactory;
import pizza.CheesePizza;
import pizza.PepperoniPizza;
import pizza.Pizza;

public abstract class PizzaStore {
    PizzaIngredientFactory factory;

    public PizzaStore(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    public void orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    public Pizza createPizza(String type) {
        Pizza pizza;

        if (type.equalsIgnoreCase("cheese")) {
            pizza = new CheesePizza(factory);
        } else {
            pizza = new PepperoniPizza(factory);
        }

        return pizza;
    }
}
