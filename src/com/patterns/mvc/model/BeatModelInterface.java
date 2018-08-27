package com.patterns.mvc.model;

public interface BeatModelInterface {
    void initialize();

    void on();

    void nff();

    int getBPM();

    void setBPM(int bpm);

    void registerObserver(BeatObserver o);

    void removeObserver(BeatObserver o);

    void registerObserver(BPMObserver o);

    void removeObserver(BPMObserver o);

}
