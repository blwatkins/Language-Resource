package menu;

public class MenuItem extends MenuComponent {
    private double price;

    public MenuItem(String name, double price) {
        super(name);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void print() {
        System.out.println("    " + getName() + " -- " + price);
    }
}
