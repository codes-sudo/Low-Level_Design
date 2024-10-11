package org.example.learning.Decorator.Example1;

public class ExtraCheese {
    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
        System.out.println("Extra Cheese Called ");
    }

    public int cost() {
        return this.basePizza.cost() * 10;
    }
}
