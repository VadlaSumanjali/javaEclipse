package day16;
import java.util.Scanner;

public class TwistedPrime {
    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = reverse(n);
        if (isPrime(n) && isPrime(rev)) {
            System.out.println("Twisted Prime");
        } else {
            System.out.println("Not Twisted Prime");
        }
    }
}
