package Day2;
import java.util.Scanner;

class ThreeDigitMultipleOf2And5And10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n >= 100 && n <= 999 && n % 2 == 0 && n % 5 == 0 && n % 10 == 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
