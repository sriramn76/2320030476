package POSTLAB;

public class EmployeeDemo {
    public static void main(String[] args) {
        EmployeeList employeeList = new EmployeeList();
        
        employeeList.addEmployee(new Employee(101, "Sreya", "Marketing", 68000));
        employeeList.addEmployee(new Employee(102, "Raghu", "Engineering", 75000));
        employeeList.addEmployee(new Employee(103, "Deekshita", "Marketing", 65000));
        employeeList.addEmployee(new Employee(104, "Sai", "Engineering", 60000));
        employeeList.addEmployee(new Employee(105, "Shiva", "Finance", 80000));
        employeeList.addEmployee(new Employee(106, "Shashank", "Finance", 82000));

        System.out.println("Employee details:");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}
