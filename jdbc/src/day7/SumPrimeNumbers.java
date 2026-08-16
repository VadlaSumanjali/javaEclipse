package day7;
import java.util.Scanner;

public class SumPrimeNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for (int num = 2; num <= n; num++) {

            int count = 0;

            for (int i = 1; i <= num; i++) {

                if (num % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                sum = sum + num;
            }
        }

        System.out.println(sum);
    }
}