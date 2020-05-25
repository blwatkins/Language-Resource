import factory.PizzaFactory;
import pizzastore.PizzaStore;

public class Main {

    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(pizzaFactory);
        pizzaStore.orderPizza("Cheese");
        System.out.println();
        pizzaStore.orderPizza("Pepperoni");
    }
}
