import pizzastore.*;

public class Main {

    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NewYorkStylePizzaStore();
        nyPizzaStore.orderPizza("Cheese");
        System.out.println();
        PizzaStore chicagoPizzaStore = new ChicagoStylePizzaStore();
        chicagoPizzaStore.orderPizza("Pepperoni");
    }
}
