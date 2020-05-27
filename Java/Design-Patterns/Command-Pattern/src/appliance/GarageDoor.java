package appliance;

public class GarageDoor {
    private boolean open;

    public GarageDoor() {
        open = false;
    }

    public void up() {
        open = true;
        System.out.println("Garage door is going up");
    }

    public void down() {
        open = false;
        System.out.println("Garage door is going down");
    }

    public boolean isOpen() {
        return open;
    }
}
