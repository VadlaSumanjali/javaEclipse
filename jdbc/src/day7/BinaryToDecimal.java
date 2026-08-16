package day7;
import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int binary = sc.nextInt();

        int decimal = 0;
        int power = 1;

        while (binary > 0) {

            int digit = binary % 10;

            decimal = decimal + digit * power;

            power = power * 2;

            binary = binary / 10;
        }

        System.out.println(decimal);
    }
}