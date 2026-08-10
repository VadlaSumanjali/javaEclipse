package Day1;
import java.util.Scanner;

class SumCombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(m + n);
        System.out.println(m + k);
        System.out.println(n + k);
    }
}