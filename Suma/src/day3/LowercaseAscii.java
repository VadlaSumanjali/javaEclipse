package day3;
import java.util.Scanner;

public class LowercaseAscii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n >= 97 && n <= 122) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}