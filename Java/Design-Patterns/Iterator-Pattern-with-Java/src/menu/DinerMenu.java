package menu;

import java.util.Iterator;

import iterator.DinerMenuIterator;

public class DinerMenu implements Menu {
    private static final int MAX_ITEMS = 6;
    private int numberOfItems;
    private MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        numberOfItems = 0;
        addItem("BLT", 2.99);
        addItem("Soup of the Day", 3.29);
        addItem("Hot Dog", 3.05);
    }

    public Iterator<MenuItem> createIterator() {
        return (new DinerMenuIterator(menuItems));
    }

    private void addItem(String name, double price) {

        if (numberOfItems < MAX_ITEMS) {
            MenuItem menuItem = new MenuItem(name, price);
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }
}
