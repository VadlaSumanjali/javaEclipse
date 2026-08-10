package Day1;

import java.util.Scanner;

class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int celsius = sc.nextInt();

        double fahrenheit = ((celsius * 9.0) / 5) + 32;

        System.out.println(fahrenheit);
    }
}