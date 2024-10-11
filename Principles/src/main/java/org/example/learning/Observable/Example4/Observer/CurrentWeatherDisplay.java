package org.example.learning.Observable.Example4.Observer;


import org.example.learning.Observable.Example4.Observable.Observable;

public class CurrentWeatherDisplay implements Observer{
    private int temperature;
    private int humidity;

    public CurrentWeatherDisplay(Observable observable) {
        observable.registerObserver(this);
    }

    @Override
    public void update(int temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Temperature :" +temperature + " Humidity :" + humidity);
    }
}
