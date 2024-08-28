package POSTLAB1;

public class EmployeeSalaryDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Sriram", "Manager");
        Employee emp2 = new Employee("Chandra", "Developer");
        Employee emp3 = new Employee("Shannu", "Intern");
        Employee emp4 = new Employee("Jayaram", "Designer");

        SalaryCalculator calculator = new SalaryCalculator();

        System.out.println(emp1.getName() + "'s salary: $" + calculator.calculateSalary(emp1));
        System.out.println(emp2.getName() + "'s salary: $" + calculator.calculateSalary(emp2));
        System.out.println(emp3.getName() + "'s salary: $" + calculator.calculateSalary(emp3));
        System.out.println(emp4.getName() + "'s salary: $" + calculator.calculateSalary(emp4));
    }
}