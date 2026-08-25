package day16;
import java.util.Scanner;

public class ValidPrime {
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
    static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = digitSum(n);
        if (isPrime(n) && isPrime(sum)) {
            System.out.println("Valid Prime");
        } else {
            System.out.println("Invalid Prime");
        }
    }
}