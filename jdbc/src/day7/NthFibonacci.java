package day7;
import java.util.Scanner;

public class NthFibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        if (n == 0) {
            System.out.println(0);
        } else if (n == 1) {
            System.out.println(1);
        } else {

            for (int i = 2; i <= n; i++) {

                int c = a + b;

                a = b;
                b = c;
            }

            System.out.println(b);
        }
    }
}