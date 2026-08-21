package day10;
import java.util.Scanner;

class Maximum {

    int max(int a, int b) {
        return a > b ? a : b;
    }

    int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    double max(double a, double b) {
        return a > b ? a : b;
    }
}

public class FindMaximum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Maximum m = new Maximum();

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

            System.out.println("Maximum: " + m.max(a, b));

        } else if (choice == 2) {

            System.out.print("Number 1: ");
            int a = sc.nextInt();

            System.out.print("Number 2: ");
            int b = sc.nextInt();

            System.out.print("Number 3: ");
            int c = sc.nextInt();

            System.out.println("Maximum: " + m.max(a, b, c));

        } else if (choice == 3) {

            System.out.print("Number 1: ");
            double a = sc.nextDouble();

            System.out.print("Number 2: ");
            double b = sc.nextDouble();

            System.out.println("Maximum: " + m.max(a, b));

        } else {
            System.out.println("Invalid choice");
        }
    }
}