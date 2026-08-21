package day10;
import java.util.Scanner;

class DiscountCalculator {

    double discount(double price, double percentage) {
        return price - (price * percentage / 100);
    }

    double discount(double price, double percentage,
                    int quantity) {
        double total = price * quantity;
        return total - (total * percentage / 100);
    }

    double discount(double price, int fixedDiscount) {
        return price - fixedDiscount;
    }
}

public class CalculateDiscount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DiscountCalculator d = new DiscountCalculator();

        System.out.println("1. Percentage Discount");
        System.out.println("2. Percentage Discount with Quantity");
        System.out.println("3. Fixed Discount");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {

            System.out.print("Price: ");
            double price = sc.nextDouble();

            System.out.print("Discount Percentage: ");
            double percentage = sc.nextDouble();

            System.out.println("Final Price: " +
                    d.discount(price, percentage));

        } else if (choice == 2) {

            System.out.print("Price: ");
            double price = sc.nextDouble();

            System.out.print("Discount Percentage: ");
            double percentage = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            System.out.println("Final Price: " +
                    d.discount(price, percentage, quantity));

        } else if (choice == 3) {

            System.out.print("Price: ");
            double price = sc.nextDouble();

            System.out.print("Fixed Discount: ");
            int fixedDiscount = sc.nextInt();

            System.out.println("Final Price: " +
                    d.discount(price, fixedDiscount));

        } else {
            System.out.println("Invalid choice");
        }
    }
}
