package waitress;

import java.util.Iterator;
import java.util.List;

import menu.Menu;
import menu.MenuItem;

public class Waitress {
    private List<Menu> menus;

    public Waitress(List<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {

        for (Menu menu: menus) {
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator<MenuItem> iterator) {

        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem.getName() + " -- " + menuItem.getPrice());
        }
    }
}
