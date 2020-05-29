package beverage;

public class Coffee extends Beverage {

    protected void brew() {
        System.out.println("Brewing coffee!");
    }

    protected void addCondiments() {
        System.out.println("Adding milk and sugar to coffee");
    }
}
