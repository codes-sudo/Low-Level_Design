package org.example.learning.Decorator.Example2;

public class ExtraCheese extends BurgerDecorator{
    private Burger burger;

    public ExtraCheese(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + " Extra Cheese";
    }

    @Override
    public double getCost() {
        return burger.getCost() + 10.0;
    }
}
