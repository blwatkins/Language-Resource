package pizzastore;

import factory.NewYorkStylePizzaIngredientFactory;

public class NewYorkStylePizzaStore extends PizzaStore {

    public NewYorkStylePizzaStore() {
        super(new NewYorkStylePizzaIngredientFactory());
    }
}
