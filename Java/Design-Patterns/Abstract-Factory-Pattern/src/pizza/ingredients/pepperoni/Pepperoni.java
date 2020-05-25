package pizza.ingredients.pepperoni;

public abstract class Pepperoni {
    private String name;

    public Pepperoni(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
