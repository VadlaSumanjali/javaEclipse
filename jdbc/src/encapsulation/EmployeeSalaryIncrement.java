package encapsulation;

import java.util.Scanner;

class Employee {

    private double salary;

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Salary cannot be negative");
            return;
        }

        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentage) {

        if (percentage < 0) {
            System.out.println("Percentage cannot be negative");
            return;
        }

        salary = salary + (salary * percentage / 100);
    }
}

public class EmployeeSalaryIncrement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee e = new Employee();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Increase Percentage: ");
        double percentage = sc.nextDouble();

        e.setSalary(salary);

        e.increaseSalary(percentage);

        System.out.println("Final Salary: " + e.getSalary());

        sc.close();
    }
}
