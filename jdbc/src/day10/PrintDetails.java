package day10;
import java.util.Scanner;

class Printer {

    void print(int number) {
        System.out.println("Number: " + number);
    }

    void print(String name) {
        System.out.println("Name: " + name);
    }

    void print(int number, String name) {
        System.out.println("Number: " + number);
        System.out.println("Name: " + name);
    }
}

public class PrintDetails {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Printer p = new Printer();

        System.out.println("Choose an option:");
        System.out.println("1. Print Number");
        System.out.println("2. Print Name");
        System.out.println("3. Print Number and Name");

        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {

            case 1:
                System.out.print("Enter Number: ");
                int number = sc.nextInt();

                p.print(number);
                break;

            case 2:
                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                p.print(name);
                break;

            case 3:
                System.out.print("Enter Number: ");
                number = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Name: ");
                name = sc.nextLine();

                p.print(number, name);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}