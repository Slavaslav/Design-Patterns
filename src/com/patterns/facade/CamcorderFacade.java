package com.patterns.facade;

public class CamcorderFacade {
    private TVCamera tvCamera = new TVCamera();
    private Timer timer = new Timer();
    private Storage storage = new Storage();

    public void startVideoRecording() {
        tvCamera.startConvertingOpticalImage();
        timer.startTimer();
        storage.startSaving();
    }

    public void stopVideoRecording() {
        tvCamera.stopConvertingOpticalImage();
        timer.stopTimer();
        storage.stopSaving();
    }
}