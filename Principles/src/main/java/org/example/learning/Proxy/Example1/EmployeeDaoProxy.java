package org.example.learning.Proxy.Example1;

public class EmployeeDaoProxy implements EmployeeDao{
    // has a Relationship
    EmployeeDao employeeDao;

    EmployeeDaoProxy() {
        employeeDao = new EmployeeDaoImpl();
    }


    @Override
    public void create(String client, EmployeeDao obj) throws Exception {
            if(client.equals("ADMIN")) {
                employeeDao.create(client, obj);
                return;
            }
            throw new Exception();
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        if(client.equals("ADMIN")) {
            employeeDao.delete(client, employeeId);
            return;
        }
        throw new Exception();
    }

    @Override
    public EmployeeDo get(String client, int employeeId) throws Exception {
        if(client.equals("ADMIN") || client.equals("USER")) {
            employeeDao.get(client,employeeId);
        }
        throw new Exception();
    }
}
