package org.example.learning.Decorator.Example2;

public class ZingerBurger extends Burger{

    @Override
    public String getDescription() {
        return "Zinger Burger";
    }

    @Override
    public double getCost() {
        return 180.0;
    }
}
