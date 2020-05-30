import java.util.ArrayList;
import java.util.List;

import menu.CafeMenu;
import menu.DinerMenu;
import menu.Menu;
import menu.PancakeHouseMenu;
import waitress.Waitress;

public class Main {

    public static void main(String[] args) {
        List<Menu> menus = new ArrayList<>();
        menus.add(new PancakeHouseMenu());
        menus.add(new DinerMenu());
        menus.add(new CafeMenu());
        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }
}
