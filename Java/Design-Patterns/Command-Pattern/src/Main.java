import appliance.GarageDoor;
import appliance.Light;
import appliance.Sprinkler;

public class Main {

    public static void main(String[] args) {
        Light kitchenLight = new Light("Kitchen");
        Light livingRoomLight = new Light("Living Room");
        GarageDoor garageDoor = new GarageDoor();
        Sprinkler sprinkler = new Sprinkler();
    }
}
