package day9;
class PersonDetails {
    String name;
    int age;

    PersonDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class StudentDetails extends PersonDetails {
    int rollNo;
    int marks;

    StudentDetails(String name, int age, int rollNo, int marks) {
        super(name, age);
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

public class StudentInheritance {
    public static void main(String[] args) {
        StudentDetails s = new StudentDetails("Sumanjali", 20, 101, 85);
        s.display();
    }
}