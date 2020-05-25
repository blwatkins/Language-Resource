package pizza.ingreedients.cheese;

public abstract class Cheese {
    private String name;

    public Cheese(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
