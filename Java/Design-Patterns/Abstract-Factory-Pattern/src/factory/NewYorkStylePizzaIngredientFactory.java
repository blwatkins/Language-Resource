package factory;

import pizza.ingredients.cheese.Cheese;
import pizza.ingredients.cheese.ProvoloneCheese;
import pizza.ingredients.dough.Dough;
import pizza.ingredients.dough.ThinCrustDough;
import pizza.ingredients.pepperoni.MildPepperoni;
import pizza.ingredients.pepperoni.Pepperoni;

public class NewYorkStylePizzaIngredientFactory implements PizzaIngredientFactory {

    public Cheese createCheese() {
        return (new ProvoloneCheese());
    }

    public Dough createDough() {
        return (new ThinCrustDough());
    }

    public Pepperoni createPepperoni() {
        return (new MildPepperoni());
    }
}
