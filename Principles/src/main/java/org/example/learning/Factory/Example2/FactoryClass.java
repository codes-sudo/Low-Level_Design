package org.example.learning.Factory.Example2;

public class FactoryClass {

    public static Shape getReference(String shape) {
        if(shape.equals("circle")) {
            return new Circle();
        } else if (shape.equals("square")) {
            return new Square();
        }
        return null;
    }
}
