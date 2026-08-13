package day4;
import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println("Before Swapping");
        System.out.println(n1 + " " + n2);

        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("After Swapping");
        System.out.println(n1 + " " + n2);
    }
}
