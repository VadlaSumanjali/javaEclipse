package day10;
import java.util.Scanner;

class Multiplication {

    int multiply(int a, int b) {
        return a * b;
    }

    int multiply(int a, int b, int c) {
        return a * b * c;
    }

    double multiply(double a, double b) {
        return a * b;
    }
}

public class MultiplyNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Multiplication m = new Multiplication();

        System.out.println("1. Two Integers");
        System.out.println("2. Three Integers");
        System.out.println("3. Two Double Values");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {

            System.out.print("Number 1: ");
            int a = sc.nextInt();

            System.out.print("Number 2: ");
            int b = sc.nextInt();

            System.out.println("Product: " + m.multiply(a, b));

        } else if (choice == 2) {

            System.out.print("Number 1: ");
            int a = sc.nextInt();

            System.out.print("Number 2: ");
            int b = sc.nextInt();

            System.out.print("Number 3: ");
            int c = sc.nextInt();

            System.out.println("Product: " + m.multiply(a, b, c));

        } else if (choice == 3) {

            System.out.print("Number 1: ");
            double a = sc.nextDouble();

            System.out.print("Number 2: ");
            double b = sc.nextDouble();

            System.out.println("Product: " + m.multiply(a, b));

        } else {
            System.out.println("Invalid choice");
        }
    }
}
