package remote;

import command.Command;
import command.NoCommand;

public class Remote {
    private final int numberOfSlots;
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public Remote() {
        numberOfSlots = 5;
        onCommands = new Command[numberOfSlots];
        offCommands = new Command[numberOfSlots];
        Command noCommand = new NoCommand();
        undoCommand = noCommand;

        for (int i = 0; i < numberOfSlots; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
            if (validButton(slot)) {
                onCommands[slot] = onCommand;
                offCommands[slot] = offCommand;
            }
    }

    public void onButton(int slot) {
        if (validButton(slot)) {
            onCommands[slot].execute();
            undoCommand = onCommands[slot];
        }
    }

    public void offButton(int slot) {
        if (validButton(slot)) {
            offCommands[slot].execute();
            undoCommand = offCommands[slot];
        }
    }

    public void undoButton() {
        undoCommand.undo();
    }

    private boolean validButton(int slot) {
        return slot < numberOfSlots;
    }
}
