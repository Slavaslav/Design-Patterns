package com.patterns.command;


public class SimpleRemoteControl {
    private Command slot;

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }

    public void buttonUndoWasPressed() {
        slot.undo();
    }
}