package waitress;

import iterator.Iterator;
import menu.Menu;
import menu.MenuItem;

import java.util.List;

public class Waitress {
    List<Menu> menus;

    public Waitress(List<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {

        for (Menu menu: menus) {
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator iterator) {

        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.println(menuItem.getName() + " -- " + menuItem.getPrice());
        }
    }
}
