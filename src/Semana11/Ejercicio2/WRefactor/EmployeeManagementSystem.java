
package Semana11.Ejercicio2.WRefactor;

import java.util.Scanner;

public class EmployeeManagementSystem {

   private EmployeeRepository repository;

    public EmployeeManagementSystem() {
        this.repository = new EmployeeRepository();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Employee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. List Employees");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    showCase1(scanner);
                    break;
                case 2:
                    showCase2();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    private void showCase1(Scanner scanner) {
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee age: ");
        int age = scanner.nextInt();
        repository.addEmployee(name, age);
    }

    private void showCase2() {
        repository.listEmployees();
    }
}

