package encapsulation;

import java.util.Scanner;

class Student {

    private int marks;

    public void setMarks(int marks) {

        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Enter valid marks");
        }
    }

    public int getMarks() {
        return marks;
    }
}

public class StudentMarls {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        s.setMarks(marks);

        System.out.println("Marks: " + s.getMarks());

        sc.close();
    }
}