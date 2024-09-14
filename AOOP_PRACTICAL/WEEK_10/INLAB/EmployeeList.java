package INLAB;

import java.util.*;

public class EmployeeList implements Iterable<Employee> {
    private List<Employee> employees;

    public EmployeeList() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee.clone()); 
    }

    @Override
    public Iterator<Employee> iterator() {
        return employees.iterator();
    }
}
