package WEEK_6;
import java.util.*;

public class EmployeeManager {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Modi", 54, 9000000));
        employees.add(new Employee("Amit Sha", 43, 6000000));
        employees.add(new Employee("KCR", 40, 1000000));


        Collections.sort(employees);
        System.out.println("Sorted by name (Comparable):");
        printEmployees(employees);


        System.out.println(); 


        Collections.sort(employees, new EmployeeSalaryComparator());
        System.out.println("Sorted by salary (Comparator):");
        printEmployees(employees);
        System.out.println();  
        Employee original = employees.get(0);
        Employee clone = original.clone();
        System.out.println("Original: " + original);
        System.out.println("Clone: " + clone);
        System.out.println(); 

        EmployeeIterator iterator = new EmployeeIterator(employees);
        System.out.println("Iterating over employees:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void printEmployees(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
