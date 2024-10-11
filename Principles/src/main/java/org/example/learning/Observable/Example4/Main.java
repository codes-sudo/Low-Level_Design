package org.example.learning.Observable.Example4;

import org.example.learning.Observable.Example4.Observable.WeatherStation;
import org.example.learning.Observable.Example4.Observer.AverageTemperatureDisplay;
import org.example.learning.Observable.Example4.Observer.CurrentWeatherDisplay;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        CurrentWeatherDisplay currentWeatherDisplay = new CurrentWeatherDisplay(weatherStation);

        AverageTemperatureDisplay averageTemperatureDisplay = new AverageTemperatureDisplay(weatherStation);

        weatherStation.parametersChanged(20, 10);

        delay();

        weatherStation.parametersChanged(30, 20);

        delay();

        weatherStation.parametersChanged(40, 30);

    }

    private static void delay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
