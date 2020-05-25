package pizza;

import factory.PizzaIngredientFactory;
import pizza.ingredients.cheese.Cheese;
import pizza.ingredients.dough.Dough;
import pizza.ingredients.pepperoni.Pepperoni;

public abstract class Pizza {
    String name;
    PizzaIngredientFactory factory;
    Cheese cheese;
    Dough dough;
    Pepperoni pepperoni;

    public Pizza(String name, PizzaIngredientFactory factory) {
        this.name = name;
        this.factory = factory;
    }

    public abstract void prepare();

    public void bake() {
        System.out.println("Baking for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting into triangle slices");
    }

    public void box() {
        System.out.println("Putting into a box");
    }

    public String getName() {
        return name;
    }
}
