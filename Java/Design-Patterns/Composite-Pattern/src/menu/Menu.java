package menu;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {
    private List<MenuComponent> menuComponents;
    private String description;

    public Menu(String name, String description) {
        super(name);
        this.description = description;
        menuComponents = new ArrayList<>();
    }

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public String getDescription() {
        return description;
    }

    public void print() {
        printNameAndDescription();

        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }

    private void printNameAndDescription() {
        System.out.println(getName() + " -- " + description);
        System.out.println("---------------------");
    }
}
