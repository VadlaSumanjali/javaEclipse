package day3;
import java.util.Scanner;

public class UppercaseAscii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n >= 65 && n <= 90) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
