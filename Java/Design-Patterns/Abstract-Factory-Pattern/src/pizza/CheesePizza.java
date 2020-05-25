package pizza;

import factory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

    public CheesePizza(PizzaIngredientFactory factory) {
        super("Cheese Pizza", factory);
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        cheese = factory.createCheese();
        System.out.println("Adding " + cheese.getName());
        dough = factory.createDough();
        System.out.println("Adding " + dough.getName());
    }
}
