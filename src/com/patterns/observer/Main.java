package com.patterns.observer;


import com.patterns.observer.View.CurrentConditionsDisplay;
import com.patterns.observer.View.ForecastDisplay;
import com.patterns.observer.View.NewDisplay;
import com.patterns.observer.View.StatisticDisplay;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.registerObserver(new CurrentConditionsDisplay());
        weatherData.registerObserver(new ForecastDisplay());
        weatherData.registerObserver(new StatisticDisplay());
        weatherData.setMeasurements(10, 20, 30);
        weatherData.registerObserver(new NewDisplay());
        weatherData.setMeasurements(100, 200, 300);
    }
}
