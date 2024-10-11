package org.example.learning.Factory.Example2;

public class Test {
    public static void main(String[] args) {
        Shape circle = FactoryClass.getReference("circle");
        // create a circle;
        circle.draw();

        Shape square = FactoryClass.getReference("square");
        // create a square;
        square.draw();
    }
}
