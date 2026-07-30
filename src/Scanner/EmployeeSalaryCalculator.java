package Scanner;
import java.util.Scanner;

public class EmployeeSalaryCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID : ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary : ");
        double basicSalary = sc.nextDouble();

        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.10;
        double grossSalary = basicSalary + hra + da;

        System.out.println("\nEmployee Details");
        System.out.println("----------------");
        System.out.println("Employee ID   : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Basic Salary  : " + basicSalary);
        System.out.println("HRA           : " + hra);
        System.out.println("DA            : " + da);
        System.out.println("Gross Salary  : " + grossSalary);

        sc.close();
    }
}
