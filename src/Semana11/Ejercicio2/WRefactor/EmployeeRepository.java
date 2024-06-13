package Semana11.Ejercicio2.WRefactor;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {

    private List<Employee> employees;

    public EmployeeRepository() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String name, int age) {
        Employee employee = new Employee(name, age);
        employees.add(employee);
        System.out.println("Employee added: " + employee);
    }

    public void listEmployees() {
        System.out.println("List of Employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
