package org.example.learning.Factory.Example1;

public class Finance implements Employee{
    @Override
    public int salary() {
        System.out.println("Getting Finance Employee Salary");
        return 50000;
    }
}
