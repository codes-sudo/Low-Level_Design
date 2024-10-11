package org.example.learning.Proxy.Example1;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void create(String client, EmployeeDao obj) throws Exception {
        // creates a Row
        System.out.println("Creates A Row");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        // Deletes a Row
        System.out.println("Deletes A Row");
    }

    @Override
    public EmployeeDo get(String client, int employeeId) throws Exception {
        // fetch a Row
        System.out.println("Fetching A Row");
        return new EmployeeDo();
    }
}
