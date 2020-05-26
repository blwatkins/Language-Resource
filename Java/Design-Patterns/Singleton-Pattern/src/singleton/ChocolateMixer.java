package singleton;

public class ChocolateMixer {
    private boolean empty;
    private boolean boiled;
    private ChocolateMixer chocolateMixer;

    private ChocolateMixer() {
        empty = true;
        boiled = false;
    }

    public synchronized ChocolateMixer getInstance() {

        if (chocolateMixer == null) {
            chocolateMixer = new ChocolateMixer();
        }

        return chocolateMixer;
    }

    public void fill() {

        if (isEmpty()) {
            empty = false;
            boiled = false;
            System.out.println("Filling the mixer");
        }
    }

    public void drain() {

        if (!isEmpty() && isBoiled()) {
            empty = true;
            System.out.println("Draining the boiled mixture");
        }
    }

    public void boil() {

        if (!isEmpty() && !isBoiled()) {
            boiled = true;
            System.out.println("Boiling the mixture");
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
