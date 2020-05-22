import ducks.*;

public class Main {

    public static void main(String[] args) {
        makeAndShowDecoyDuck();
        makeAndShowMallardDuck();
        makeAndShowRubberDuck();
    }

    private static void makeAndShowDecoyDuck() {
        System.out.println("Decoy Duck!");
        Duck decoy = new DecoyDuck();
        performActions(decoy);
        System.out.println();
    }

    private static void makeAndShowMallardDuck() {
        System.out.println("Mallard Duck!");
        Duck mallard = new MallardDuck();
        performActions(mallard);
        System.out.println();
    }

    private static void makeAndShowRubberDuck() {
        System.out.println("Rubber Duck!");
        Duck rubber = new RubberDuck();
        performActions(rubber);
        System.out.println();
    }

    private static void performActions(Duck duck) {
        duck.fly();
        duck.makeNoise();
        duck.swim();
    }
}
