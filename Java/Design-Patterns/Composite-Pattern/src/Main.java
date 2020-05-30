import menu.Menu;
import menu.MenuComponent;
import menu.MenuItem;
import waitress.Waitress;

public class Main {

    public static void main(String[] args) {
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert");

        pancakeHouseMenu.add(new MenuItem("Pancakes", 2.99));
        pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes", 3.49));
        pancakeHouseMenu.add(new MenuItem("Waffles", 3.59));

        dinerMenu.add(new MenuItem("BLT", 2.99));
        dinerMenu.add(new MenuItem("Soup of the Day", 3.29));
        dinerMenu.add(new MenuItem("Hot Dog", 3.05));

        cafeMenu.add(new MenuItem("Soup of the Day", 3.69));
        cafeMenu.add(new MenuItem("Burrito", 4.29));
        cafeMenu.add(new MenuItem("Burger", 3.99));

        dessertMenu.add(new MenuItem("Apple Pie", 1.59));
        dessertMenu.add(new MenuItem("Pumpkin Pie", 1.59));

        cafeMenu.add(dessertMenu);

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenus();
    }
}
