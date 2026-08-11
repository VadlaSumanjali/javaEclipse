package Day2;
import java.util.Scanner;

class MultipleOf5And3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n % 5 == 0 && n % 3 == 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
