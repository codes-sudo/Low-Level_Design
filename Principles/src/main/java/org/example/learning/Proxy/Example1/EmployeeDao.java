package org.example.learning.Proxy.Example1;

public interface EmployeeDao {

     void create(String client, EmployeeDao obj) throws Exception;
     void delete(String client, int employeeId) throws Exception;
     EmployeeDo get(String client, int employeeId) throws Exception;
}
