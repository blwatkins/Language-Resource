package iterator;

import java.util.List;

import menu.MenuItem;

public class PancakeHouseMenuIterator implements Iterator {
    private List<MenuItem> menuItems;
    private int index;

    public PancakeHouseMenuIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
        index = 0;
    }

    public boolean hasNext() {
        return index < menuItems.size();
    }

    public MenuItem next() {
        MenuItem menuItem = menuItems.get(index);
        index++;
        return menuItem;
    }
}
