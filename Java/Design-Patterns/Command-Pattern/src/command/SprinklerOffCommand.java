package command;

import appliance.Sprinkler;

public class SprinklerOffCommand implements Command {
    private Sprinkler sprinkler;

    public SprinklerOffCommand(Sprinkler sprinkler) {
        this.sprinkler = sprinkler;
    }

    public void execute() {
       sprinkler.waterOff();
    }

    public void undo() {
        sprinkler.waterOn();
    }
}
