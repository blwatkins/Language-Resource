package iterator;

import menu.MenuItem;

public class DinerMenuIterator implements Iterator {
    MenuItem[] menuItems;
    int index = 0;

    public boolean hasNext() {
        boolean hasNext = false;

        if (index < menuItems.length && menuItems[index] != null) {
            hasNext = true;
        }

        return hasNext;
    }

    public MenuItem next() {
        MenuItem item = menuItems[index];
        index++;
        return item;
    }
}
