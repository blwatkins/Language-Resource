import ducks.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Decoy Duck!");
        Duck decoy = new DecoyDuck();
        performActions(decoy);

        System.out.println("Mallard Duck!");
        Duck mallard = new MallardDuck();
        performActions(mallard);

        System.out.println("Rubber Duck!");
        Duck rubber = new RubberDuck();
        performActions(rubber);
    }

    private static void performActions(Duck duck) {
        duck.fly();
        duck.makeNoise();
        duck.swim();
    }
}
