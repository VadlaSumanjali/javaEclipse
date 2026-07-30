package Scanner;
import java.util.Scanner;

public class StudentMarksReport {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Java Marks : ");
        int java = sc.nextInt();

        System.out.print("Enter SQL Marks : ");
        int sql = sc.nextInt();

        System.out.print("Enter HTML Marks : ");
        int html = sc.nextInt();

        System.out.print("Enter CSS Marks : ");
        int css = sc.nextInt();

        System.out.print("Enter JavaScript Marks : ");
        int javascript = sc.nextInt();

        int total = java + sql + html + css + javascript;
        double average = total / 5.0;
        double percentage = (total / 500.0) * 100;

        System.out.println("\nResult");
        System.out.println("------");
        System.out.println("Total Marks : " + total);
        System.out.println("Average     : " + average);
        System.out.println("Percentage  : " + percentage + "%");

        sc.close();
    }
}
