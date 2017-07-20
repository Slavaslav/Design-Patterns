package com.patterns.observer.View;

import com.patterns.observer.Observer;
import com.patterns.observer.Subject;
import com.patterns.observer.WeatherData;

public class NewDisplay implements Observer {
    @Override
    public void update(Subject subject, Object o) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            System.out.println("New display");
        }
    }
}