package day7;
import java.util.Scanner;

public class LCMNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int i = 1;

        while (true) {
            if ((a * i) % b == 0) {
                System.out.println(a * i);
                break;
            }
            i++;
        }
    }
}