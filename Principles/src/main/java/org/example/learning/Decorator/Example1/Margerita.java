package org.example.learning.Decorator.Example1;

public class Margerita extends BasePizza {

    public Margerita() {
        System.out.println("Margerita Called");
    }

    @Override
    public int cost() {
        return 100;
    }
}
