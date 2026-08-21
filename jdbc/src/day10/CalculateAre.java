package day10;
import java.util.Scanner;

class AreaCalculator {

    int area(int side) {
        return side * side;
    }

    int area(int length, int breadth) {
        return length * breadth;
    }

    double area(double radius) {
        return 3.14 * radius * radius;
    }
}

public class CalculateArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AreaCalculator a = new AreaCalculator();

        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {

            System.out.print("Side: ");
            int side = sc.nextInt();

            System.out.println("Area of Square: " + a.area(side));

        } else if (choice == 2) {

            System.out.print("Length: ");
            int length = sc.nextInt();

            System.out.print("Breadth: ");
            int breadth = sc.nextInt();

            System.out.println("Area of Rectangle: " +
                    a.area(length, breadth));

        } else if (choice == 3) {

            System.out.print("Radius: ");
            double radius = sc.nextDouble();

            System.out.println("Area of Circle: " +
                    a.area(radius));

        } else {
            System.out.println("Invalid choice");
        }
    }
}