package menu;

import java.util.*;

public class CafeMenu implements Menu {
    private Map<String, MenuItem> menuItems;

    public CafeMenu() {
        menuItems = new HashMap<>();
        addItem("Soup of the Day", 3.69);
        addItem("Burrito", 4.29);
        addItem("Burger", 3.99);
    }

    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }

    private void addItem(String name, double price) {
        MenuItem menuItem = new MenuItem(name, price);
        menuItems.put(name, menuItem);
    }
}
