package day4;
import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n > m) {
            System.out.println(n % m);
        } else {
            System.out.println(-1);
        }
    }
}