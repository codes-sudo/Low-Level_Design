package org.example.learning.Decorator.Example1;

public class MushRoom extends ToppingDecorator{
    BasePizza basePizza;

    public MushRoom(BasePizza pizza) {
        this.basePizza = pizza;
        System.out.println("Mushroom Called");
    }

    @Override
    public int cost() {
        return this.basePizza.cost() * 20;
    }
}
