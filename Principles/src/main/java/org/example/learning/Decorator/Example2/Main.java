package org.example.learning.Decorator.Example2;

public class Main {
    public static void main(String[] args) {
        Burger burger = new ZingerBurger();

        burger = new ExtraCheese(burger);
        System.out.println(burger.getDescription());
        System.out.println(burger.getCost());
    }
}
