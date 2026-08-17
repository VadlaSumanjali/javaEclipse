package day8;
import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int square = n * n;
        int sum = 0;

        while (square > 0) {

            int digit = square % 10;
            sum = sum + digit;

            square = square / 10;
        }

        if (sum == n) {
            System.out.println("Neon Number");
        }
        else {
            System.out.println("Not Neon Number");
        }
    }
}