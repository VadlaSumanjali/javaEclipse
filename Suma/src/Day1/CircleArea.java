package Day1;
import java.util.Scanner;

class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int radius = sc.nextInt();

        double pi = 3.142;
        double area = pi * radius * radius;

        System.out.printf("%.4f", area);
    }
}
