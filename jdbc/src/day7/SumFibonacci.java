package day7;
import java.util.Scanner;

public class SumFibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int sum = 0;

        for (int i = 1; i <= n; i++) {

            sum = sum + a;

            int c = a + b;

            a = b;
            b = c;
        }

        System.out.println(sum);
    }
}