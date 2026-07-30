package Scanner;

import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID : ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter Student Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Age : ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course : ");
        String course = sc.nextLine();

        System.out.println("\nStudent Details");
        System.out.println("---------------");
        System.out.println("Student ID   : " + id);
        System.out.println("Student Name : " + name);
        System.out.println("Age          : " + age);
        System.out.println("Course       : " + course);

        sc.close();
    }
}
