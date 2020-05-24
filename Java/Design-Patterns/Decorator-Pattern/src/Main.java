import beverage.*;
import beverage.decorator.*;

public class Main {

    public static void main(String[] args) {
        makeHouseBlendMochaSoy();
        makeDecafMocha();
    }

    private static void makeHouseBlendMochaSoy() {
        Beverage houseBlend = new HouseBlend();
        printInformation(houseBlend);
        houseBlend = new Mocha(houseBlend);
        printInformation(houseBlend);
        houseBlend = new Soy(houseBlend);
        printInformation(houseBlend);
        System.out.println();
    }

    private static void makeDecafMocha() {
        Beverage decaf = new DecafCoffee();
        printInformation(decaf);
        decaf = new Mocha(decaf);
        printInformation(decaf);
        System.out.println();
    }

    private static void printInformation(Beverage beverage) {
        System.out.println(beverage.getDescription() + " = " + beverage.getCost());
    }
}
