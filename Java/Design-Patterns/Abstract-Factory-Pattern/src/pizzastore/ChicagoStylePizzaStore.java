package pizzastore;

import factory.ChicagoStylePizzaIngredientFactory;

public class ChicagoStylePizzaStore extends PizzaStore {

    public ChicagoStylePizzaStore() {
        super(new ChicagoStylePizzaIngredientFactory());
    }
}
