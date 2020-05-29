package beverage;

public abstract class Beverage {

    public final void prepare() {
        boilWater();
        brew();
        pour();

        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    protected abstract void brew();

    protected abstract void addCondiments();

    private boolean customerWantsCondiments() {
        return true;
    }

    private void boilWater() {
        System.out.println("Boiling water!");
    }

    private void pour() {
        System.out.println("Pouring beverage");
    }

}
