package INLAB;

public class EmployeeDemo {
    public static void main(String[] args) {
        EmployeeList employeeList = new EmployeeList();
        
        employeeList.addEmployee(new Employee("John Doe", "01-01-2000", "123-456-7890", "E001"));
        employeeList.addEmployee(new Employee("Jane Smith", "05-12-2001", "234-567-8901", "E002"));
        employeeList.addEmployee(new Employee("Alice Johnson", "11-11-2002", "345-678-9012", "E003"));
        employeeList.addEmployee(new Employee("Bob Brown", "21-07-2003", "456-789-0123", "E004"));
        employeeList.addEmployee(new Employee("Charlie Davis", "30-09-2004", "567-890-1234", "E005"));

        System.out.println("Employee details:");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}