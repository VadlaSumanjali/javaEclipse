package day14;
class Student {

    private String name;
    private int rollNumber;
    private int[] marks;

    Student(String name, int rollNumber, int[] marks) {

        if (marks.length != 5) {
            throw new IllegalArgumentException("Exactly 5 marks are required");
        }

        for (int mark : marks) {
            if (mark < 0 || mark > 100) {
                throw new IllegalArgumentException("Marks must be between 0 and 100");
            }
        }

        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public int calculateTotal() {
        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        return total;
    }

    public double calculateAverage() {
        return calculateTotal() / 5.0;
    }

    public String calculateGrade() {

        double average = calculateAverage();

        if (average >= 90)
            return "A+";
        else if (average >= 80)
            return "A";
        else if (average >= 70)
            return "B";
        else if (average >= 60)
            return "C";
        else if (average >= 50)
            return "D";
        else
            return "F";
    }

    public void displayResult() {

        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Total: " + calculateTotal());
        System.out.println("Average: " + calculateAverage());
        System.out.println("Grade: " + calculateGrade());
        System.out.println("----------------------");
    }
}

public class StudentResult {

    public static void main(String[] args) {

        int[] marks1 = {80, 75, 90, 85, 70};
        int[] marks2 = {95, 92, 88, 90, 96};
        int[] marks3 = {65, 70, 60, 75, 68};

        Student s1 = new Student("Suman", 101, marks1);
        Student s2 = new Student("Rahul", 102, marks2);
        Student s3 = new Student("Priya", 103, marks3);

        s1.displayResult();
        s2.displayResult();
        s3.displayResult();
    }
}
