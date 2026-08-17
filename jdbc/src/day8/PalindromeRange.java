package day8;
import java.util.Scanner;

public class PalindromeRange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {

            int n = i;
            int reverse = 0;

            while (n > 0) {
                int digit = n % 10;
                reverse = reverse * 10 + digit;
                n = n / 10;
            }

            if (i == reverse) {
                System.out.print(i + " ");
            }
        }
    }
}
