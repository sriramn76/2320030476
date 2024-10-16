package WEEK_6;

import java.util.*;

public class EmployeeIterator implements Iterator<Employee> {
    private List<Employee> employees;
    private int position;

    public EmployeeIterator(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public boolean hasNext() {
        return position < employees.size();
    }

    @Override
    public Employee next() {
        return employees.get(position++);
    }
}