package com.patterns.facade;

public class Main {
    public static void main(String[] args) {
        CamcorderFacade camcorderFacade = new CamcorderFacade();
        camcorderFacade.startVideoRecording();
        camcorderFacade.stopVideoRecording();
    }
}