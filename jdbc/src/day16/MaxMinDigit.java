package day16;
import java.util.Scanner;

public class MaxMinDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int min = 9;
        while (n > 0) {
            int digit = n % 10;
            if (digit > max) {
                max = digit;
            }
            if (digit < min) {
                min = digit;
            }
            n /= 10;
        }
        int difference = max - min;
        System.out.println("Maximum Digit: " + max);
        System.out.println("Minimum Digit: " + min);
        System.out.println("Difference: " + difference);
    }
}
