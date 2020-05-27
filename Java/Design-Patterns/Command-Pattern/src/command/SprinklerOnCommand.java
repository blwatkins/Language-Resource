package command;

import appliance.Sprinkler;

public class SprinklerOnCommand implements Command {
    private Sprinkler sprinkler;

    public SprinklerOnCommand(Sprinkler sprinkler) {
        this.sprinkler = sprinkler;
    }

    public void execute() {
        sprinkler.waterOn();
    }

    public void undo() {
        sprinkler.waterOff();
    }
}
