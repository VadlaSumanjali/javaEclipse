package day10;
import java.util.Scanner;

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class AddNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();

        System.out.print("Number 1: ");
        int a = sc.nextInt();

        System.out.print("Number 2: ");
        int b = sc.nextInt();

        System.out.println("Sum: " + c.add(a, b));
    }
}