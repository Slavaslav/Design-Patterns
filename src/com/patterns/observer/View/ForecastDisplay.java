package com.patterns.observer.View;

import com.patterns.observer.Observer;
import com.patterns.observer.Subject;
import com.patterns.observer.WeatherData;

public class ForecastDisplay implements Observer {
    @Override
    public void update(Subject subject, Object o) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            System.out.println(String.format("Class name - %s, Temperature - %f, Humidity - %f, Pressure - %f", getClass().getSimpleName(),
                    weatherData.getTemperature(), weatherData.getHumidity(), weatherData.getPressure()));
        }
    }
}
