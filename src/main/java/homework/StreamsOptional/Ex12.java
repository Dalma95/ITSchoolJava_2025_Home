package homework.StreamsOptional;

//12.Given a list of employee objects with attributes: name, department, and salary; find the department with the highest total salary.

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex12 {
    public static void main(String[] args) {
        List<Employee> employess = List.of(
                new Employee("Alice", "HR",10000),
                new Employee("Bob", "IT",8000),
                new Employee("Charlie", "IT",7000),
                new Employee("David", "Finance",9000));

        Map<String, Integer> highest = employess.stream()
                .collect(Collectors.groupingBy(Employee :: getDepartment,Collectors.summingInt(Employee :: getSalary)));

        String department = highest.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
        System.out.println("Department with highest total salary: " + department + " with total salary: " + highest.get(department));

    }

    static class Employee{
        String name;
        String department;
        int salary;

        public String getDepartment() {
            return department;
        }

        public int getSalary() {
            return salary;
        }

        public Employee(String name, String department, int salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;


        }
    }
}
