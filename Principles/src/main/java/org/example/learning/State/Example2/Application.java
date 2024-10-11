package org.example.learning.State.Example2;

public class Application {
    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.request(); // Turns on low
        fan.request(); // Turns on medium
        fan.request(); // Turns on high
        fan.request(); // Turns off
    }
}
