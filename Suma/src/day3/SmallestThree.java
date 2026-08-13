package day3;
import java.util.Scanner;

public class SmallestThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();

        if (n <= m && n <= l) {
            System.out.println(n);
        } else if (m <= n && m <= l) {
            System.out.println(m);
        } else {
            System.out.println(l);
        }
    }
}