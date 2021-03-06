package pizza;

import factory.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {

    public PepperoniPizza(PizzaIngredientFactory factory) {
        super("Pepperoni Pizza", factory);
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        cheese = factory.createCheese();
        System.out.println("Adding " + cheese.getName());
        dough = factory.createDough();
        System.out.println("Adding " + dough.getName());
        pepperoni = factory.createPepperoni();
        System.out.println("Adding " + pepperoni.getName());
    }
}
