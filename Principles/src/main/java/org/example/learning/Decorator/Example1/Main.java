package org.example.learning.Decorator.Example1;

public class Main {
    public static void main(String[] args) {
        ExtraCheese pizza = new ExtraCheese(new Margerita());
        System.out.println(pizza.cost());
    }
}
