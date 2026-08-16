package day7;
import java.util.Scanner;

public class MaximumDigitSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int maxSum = -1;
        int maxNumber = 0;

        for (int i = 1; i <= n; i++) {

            int number = sc.nextInt();
            int temp = number;
            int sum = 0;

            while (temp > 0) {

                int digit = temp % 10;

                sum = sum + digit;

                temp = temp / 10;
            }

            if (sum > maxSum) {
                maxSum = sum;
                maxNumber = number;
            }
        }

        System.out.println(maxNumber);
    }
}
