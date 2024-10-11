package org.example.learning.Prototype.Example1;

public class BlackSheep implements Sheep{
    String name;

    public BlackSheep(String name) {
        this.name = name;
    }

    @Override
    public Sheep clone() {
        System.out.println("clone called");
        return new BlackSheep(this.name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
