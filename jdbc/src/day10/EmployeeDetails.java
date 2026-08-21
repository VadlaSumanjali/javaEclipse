package day10;
import java.util.Scanner;

class Employee {

    void display(String name) {
        System.out.println("Name: " + name);
    }

    void display(String name, double salary) {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    void display(String name, double salary, String department) {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}

public class EmployeeDetails {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.println("\nChoose an option:");
        System.out.println("1. Display Name");
        System.out.println("2. Display Name and Salary");
        System.out.println("3. Display Name, Salary and Department");

        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                e.display(name);
                break;

            case 2:
                System.out.print("Enter Salary: ");
                double salary = sc.nextDouble();

                e.display(name, salary);
                break;

            case 3:
                System.out.print("Enter Salary: ");
                salary = sc.nextDouble();
                sc.nextLine();

                System.out.print("Enter Department: ");
                String department = sc.nextLine();

                e.display(name, salary, department);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
