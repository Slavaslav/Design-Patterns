package com.patterns.mvc;

import com.patterns.mvc.model.BeatModel;
import com.patterns.mvc.model.BeatModelInterface;
import com.patterns.mvc.view.BeatController;
import com.patterns.mvc.view.ControllerInterface;

public class DJTestDrive {
    public static void main(String[] args) {
        BeatModelInterface model = new BeatModel();
        ControllerInterface controllerInterface = new BeatController(model);
    }
}
