package Day1;
import java.util.Scanner;

class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fahrenheit = sc.nextInt();

        double celsius = ((fahrenheit - 32) * 5.0) / 9;

        System.out.printf("%.4f", celsius);
    }
}