package menu;

import java.util.ArrayList;
import java.util.List;

import iterator.Iterator;
import iterator.PancakeHouseMenuIterator;

public class PancakeHouseMenu implements Menu {
    private List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        addItem("Pancakes", 2.99);
        addItem("Blueberry Pancakes", 3.49);
        addItem("Waffles", 3.59);
    }

    public Iterator createIterator() {
        return (new PancakeHouseMenuIterator(menuItems));
    }

    private void addItem(String name, double price) {
        MenuItem menuItem = new MenuItem(name, price);
        menuItems.add(menuItem);
    }
}
