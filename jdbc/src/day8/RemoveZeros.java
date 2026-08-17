package day8;
import java.util.Scanner;

public class RemoveZeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = 0; 
        int place = 1;

        while (n > 0) {

            int digit = n % 10;

            if (digit != 0) {
                result = result + digit*place ;
//                System.out.println(result);
                place = place * 10;
//                System.out.println(place);
            }

            n = n / 10;
        }

        System.out.println(result);
    }
}