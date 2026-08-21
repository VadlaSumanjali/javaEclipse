package day10;
import java.util.Scanner;

class Employee {

    double calculateSalary(double salary) {
        return salary;
    }

    double calculateSalary(double salary, int bonusPercent) {
        return salary + (salary * bonusPercent / 100);
    }

    double calculateSalary(double salary, int bonusPercent, int allowancePercent) {
        return salary
                + (salary * bonusPercent / 100)
                + (salary * allowancePercent / 100);
    }
}

public class EmployeeSalary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.println("\nChoose an option:");
        System.out.println("1. Salary Only");
        System.out.println("2. Salary + 10% Bonus");
        System.out.println("3. Salary + 10% Bonus + 20% Allowance");

        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Final Salary: " +
                        e.calculateSalary(salary));
                break;

            case 2:
                System.out.println("Final Salary: " +
                        e.calculateSalary(salary, 10));
                break;

            case 3:
                System.out.println("Final Salary: " +
                        e.calculateSalary(salary, 10, 20));
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
