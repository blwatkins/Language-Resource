package menu;

public abstract class MenuComponent {
    private String name;

    public MenuComponent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }
}
