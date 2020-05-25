package pizza;

public abstract class Pizza {
    private String name;

    public Pizza(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public void bake() {
        System.out.println("Baking for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting into triangle slices");
    }

    public void box() {
        System.out.println("Placing pizza in a box");
    }
}
