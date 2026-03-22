package student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeStreamDemo {

    static class Employee {
        private String name;
        private int age;
        private String department;
        private double salary;

        public Employee(String name, int age, String department, double salary) {
            this.name = name;
            this.age = age;
            this.department = department;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getDepartment() {
            return department;
        }

        public double getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "Employee{name='" + name + "', age=" + age +
                    ", department='" + department + "', salary=" + salary + "}";
        }
    }

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee("Alice", 25, "HR", 50000),
                new Employee("Bob", 35, "IT", 70000),
                new Employee("Charlie", 40, "Finance", 80000),
                new Employee("David", 28, "Marketing", 55000),
                new Employee("Eva", 32, "IT", 72000)
        ));

        Function<Employee, String> nameAndDepartment =
                employee -> employee.getName() + " - " + employee.getDepartment();

        List<String> employeeSummary = employees.stream()
                .map(nameAndDepartment)
                .collect(Collectors.toList());

        double averageSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);

        int ageThreshold = 30;
        List<Employee> filteredEmployees = employees.stream()
                .filter(employee -> employee.getAge() > ageThreshold)
                .collect(Collectors.toList());

        List<String> filteredSummary = filteredEmployees.stream()
                .map(nameAndDepartment)
                .collect(Collectors.toList());

        System.out.println("All Employees:");
        employees.forEach(System.out::println);

        System.out.println("\nConcatenated Name and Department:");
        employeeSummary.forEach(System.out::println);

        System.out.println("\nAverage Salary of All Employees:");
        System.out.println(averageSalary);

        System.out.println("\nEmployees Above Age " + ageThreshold + ":");
        filteredEmployees.forEach(System.out::println);

        System.out.println("\nConcatenated Name and Department for Employees Above Age " + ageThreshold + ":");
        filteredSummary.forEach(System.out::println);
    }
}