package org.example.learning.Factory.Example1;

public class EmployeeFactory {

    public static Employee getEmployee(String empType) {
        if(empType.trim().equals("Developer")) {
            return new Developer();
        } else {
            return new Finance();
        }
    }
}
