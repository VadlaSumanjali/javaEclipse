package day8;
import java.util.Scanner;

public class SmallestWithFactors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int number = 1;

        while (true) {

            int count = 0;

            for (int i = 1; i <= number; i++) {

                if (number % i == 0) {
                    count++;
                }
            }

            if (count == n) {
                System.out.println(number);
                break;
            }

            number++;
        }
    }
}
