package day16;
import java.util.Scanner;

public class MaximumDigitSum {
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
        int m = sc.nextInt();
        int n = sc.nextInt();
        int maxSum = -1;
        int answer = m;
        for (int i = m; i <= n; i++) {
            int sum = digitSum(i);
            if (sum > maxSum) {
                maxSum = sum;
                answer = i;
            }
        }
        System.out.println(answer);
    }
}
