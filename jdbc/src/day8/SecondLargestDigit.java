package day8;
import java.util.Scanner;

public class SecondLargestDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int largest = -1;
        int second = -1;

        while (n > 0) {

            int digit = n % 10;

            if (digit > largest) {
                second = largest;
                largest = digit;
            }
            else if (digit > second && digit != largest) {
                second = digit;
            }

            n = n / 10;
        }

        System.out.println(second);
    }
}