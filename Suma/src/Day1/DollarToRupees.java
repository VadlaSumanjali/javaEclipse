package Day1;
import java.util.Scanner;

class DollarToRupees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dollar = sc.nextInt();

        double rupees = dollar * 61.06;

        System.out.println(rupees);
    }
}
