package INLAB2;

import java.util.*; 

public class EmployeeSorter {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Sriram", "Engineering", 75000));
        employees.add(new Employee(102, "Chandra", "Marketing", 68000));
        employees.add(new Employee(103, "Shannu", "Finance", 80000));
        employees.add(new Employee(104, "Jayaram", "Engineering", 60000));

        

        System.out.println("Employees sorted by salary (ascending):");
        Collections.sort(employees, EmployeeComparators.bySalaryAsc);
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("\nEmployees sorted by salary (descending):");
        Collections.sort(employees, EmployeeComparators.bySalaryDesc);
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("\nEmployees sorted by name (alphabetical):");
        Collections.sort(employees, EmployeeComparators.byName);
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("\nEmployees sorted by department (alphabetical):");
        Collections.sort(employees, EmployeeComparators.byDepartment);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
