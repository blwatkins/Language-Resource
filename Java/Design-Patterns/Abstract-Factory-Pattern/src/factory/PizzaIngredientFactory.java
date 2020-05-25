package factory;

import pizza.ingredients.cheese.Cheese;
import pizza.ingredients.dough.Dough;
import pizza.ingredients.pepperoni.Pepperoni;

public interface PizzaIngredientFactory {
    Cheese createCheese();
    Dough createDough();
    Pepperoni createPepperoni();
}
