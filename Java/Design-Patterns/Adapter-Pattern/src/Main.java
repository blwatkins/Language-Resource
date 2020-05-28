import adapter.TurkeyDuck;
import duck.Duck;
import duck.MallardDuck;
import turkey.WildTurkey;

public class Main {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck turkeyDuck = new TurkeyDuck(new WildTurkey());
        performDuckActions(mallard);
        performDuckActions(turkeyDuck);
    }

    private static void performDuckActions(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
