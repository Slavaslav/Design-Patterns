package com.patterns.command;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl control = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        control.setCommand(lightOnCommand);
        control.buttonWasPressed();
        control.buttonUndoWasPressed();
    }
}