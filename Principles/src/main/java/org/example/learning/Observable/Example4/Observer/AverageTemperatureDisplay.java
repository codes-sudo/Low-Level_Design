package org.example.learning.Observable.Example4.Observer;

import org.example.learning.Observable.Example4.Observable.Observable;

public class AverageTemperatureDisplay implements Observer{
    private int sumOfTemperatures;
    private int totalTemperature;

    public AverageTemperatureDisplay(Observable observable) {
        this.sumOfTemperatures = 0;
        this.totalTemperature = 0;
        // Need to Check
        observable.registerObserver(this);
    }

    @Override
    public void update(int temperature, int humidity) {
        sumOfTemperatures += temperature;
        totalTemperature++;
        display();
    }

    private void display() {
        System.out.println("Sum of Temperatures is :"+ sumOfTemperatures);
    }
}
