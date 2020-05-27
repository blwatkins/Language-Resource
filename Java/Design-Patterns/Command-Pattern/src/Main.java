import appliance.*;
import command.*;
import remote.Remote;

public class Main {

    public static void main(String[] args) {
        Light kitchenLight = new Light("Kitchen");
        Light livingRoomLight = new Light("Living Room");
        GarageDoor garageDoor = new GarageDoor();
        Sprinkler sprinkler = new Sprinkler();

        Remote remote = new Remote();
        remote.setCommand(0, new LightOnCommand(kitchenLight), new LightOffCommand(kitchenLight));
        remote.setCommand(1, new LightOnCommand(livingRoomLight), new LightOffCommand(livingRoomLight));
        remote.setCommand(2, new GarageDoorOpenCommand(garageDoor), new GarageDoorCloseCommand(garageDoor));
        remote.setCommand(3, new SprinklerOnCommand(sprinkler), new SprinklerOffCommand(sprinkler));

        remote.onButton(1);
        remote.offButton(1);
        remote.onButton(2);
        remote.undoButton();
    }
}
