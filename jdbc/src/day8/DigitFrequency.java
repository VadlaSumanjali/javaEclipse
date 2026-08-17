package day8;
import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i <= 9; i++) {

            int temp = n;
            int count = 0;

            while (temp > 0) {

                int digit = temp % 10;

                if (digit == i) {
                    count++;
                }

                temp = temp / 10;
            }

            System.out.println(i + ": " + count);
        }
    }
}