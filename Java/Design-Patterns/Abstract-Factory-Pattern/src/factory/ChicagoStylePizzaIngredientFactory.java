package factory;

import pizza.ingredients.cheese.Cheese;
import pizza.ingredients.cheese.MozzarellaCheese;
import pizza.ingredients.dough.Dough;
import pizza.ingredients.dough.ThickCrustDough;
import pizza.ingredients.pepperoni.Pepperoni;
import pizza.ingredients.pepperoni.SpicyPepperoni;

public class ChicagoStylePizzaIngredientFactory implements PizzaIngredientFactory {

    public Cheese createCheese() {
        return (new MozzarellaCheese());
    }

    public Dough createDough() {
        return (new ThickCrustDough());
    }

    public Pepperoni createPepperoni() {
        return (new SpicyPepperoni());
    }
}
