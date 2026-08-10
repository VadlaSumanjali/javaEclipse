package Day1;
import java.util.Scanner;

class CylinderSurfaceArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int radius = sc.nextInt();
        int height = sc.nextInt();

        double pi = 3.142;
        double area = 2 * pi * radius * (radius + height);

        System.out.printf("%.4f", area);
    }
}