package day4;
import java.util.Scanner;

public class SmallestFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        int k = sc.nextInt();

        if (n <= m && n <= l && n <= k) {
            System.out.println(n);
        } else if (m <= n && m <= l && m <= k) {
            System.out.println(m);
        } else if (l <= n && l <= m && l <= k) {
            System.out.println(l);
        } else {
            System.out.println(k);
        }
    }
}
