package beverage;

public class Tea extends Beverage {

    protected void brew() {
        System.out.println("Steeping tea!");
    }

    protected void addCondiments() {
        System.out.println("Adding honey and lemon!");
    }
}
