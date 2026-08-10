package Day1;
import java.util.Scanner;

class SquarePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int side = sc.nextInt();

        int perimeter = 4 * side;

        System.out.println(perimeter);
    }
}
