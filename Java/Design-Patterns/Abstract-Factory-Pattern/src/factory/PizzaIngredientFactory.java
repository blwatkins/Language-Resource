package factory;

import pizza.ingreedients.cheese.Cheese;
import pizza.ingreedients.dough.Dough;
import pizza.ingreedients.pepperoni.Pepperoni;

public interface PizzaIngredientFactory {
    Cheese createCheese();
    Dough createDough();
    Pepperoni createPepperoni();
}
