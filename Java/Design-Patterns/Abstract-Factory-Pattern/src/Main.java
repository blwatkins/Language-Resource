import pizzastore.ChicagoStylePizzaStore;
import pizzastore.NewYorkStylePizzaStore;

public class Main {

    public static void main(String[] args) {
        NewYorkStylePizzaStore newYorkPizzaStore = new NewYorkStylePizzaStore();
        ChicagoStylePizzaStore chicagoPizzaStore = new ChicagoStylePizzaStore();
        newYorkPizzaStore.orderPizza("cheese");
        System.out.println();
        newYorkPizzaStore.orderPizza("pepperoni");
        System.out.println();
        chicagoPizzaStore.orderPizza("cheese");
        System.out.println();
        chicagoPizzaStore.orderPizza("pepperoni");
    }
}
