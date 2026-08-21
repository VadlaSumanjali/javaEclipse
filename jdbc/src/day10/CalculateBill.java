package day10;
import java.util.Scanner;

class Billing {

    double calculateBill(double price) {
        return price;
    }

    double calculateBill(double price, int quantity) {
        return price * quantity;
    }

    double calculateBill(double price, int quantity, double discount) {
        return (price * quantity) - discount;
    }
}

public class CalculateBill {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Billing b = new Billing();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.println("\nChoose an option:");
        System.out.println("1. Price Only");
        System.out.println("2. Price × Quantity");
        System.out.println("3. Price × Quantity - Discount");

        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Final Bill: " +
                        b.calculateBill(price));
                break;

            case 2:
                System.out.print("Enter Quantity: ");
                int quantity = sc.nextInt();

                System.out.println("Final Bill: " +
                        b.calculateBill(price, quantity));
                break;

            case 3:
                System.out.print("Enter Quantity: ");
                quantity = sc.nextInt();

                System.out.print("Enter Discount: ");
                double discount = sc.nextDouble();

                System.out.println("Final Bill: " +
                        b.calculateBill(price, quantity, discount));
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
