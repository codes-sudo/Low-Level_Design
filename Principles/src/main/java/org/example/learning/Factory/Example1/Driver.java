package org.example.learning.Factory.Example1;

public class Driver {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee("Finance");
        System.out.println(employee.salary());
    }
}
