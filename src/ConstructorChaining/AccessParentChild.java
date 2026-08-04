package ConstructorChaining;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

class Student extends Person {

    String name;

    Student(String parentName, String studentName) {
        super(parentName);
        this.name = studentName;
    }

    void displayNames() {
        System.out.println("Parent Name: " + super.name);
        System.out.println("Child Name: " + this.name);
    }
}

public class AccessParentChild {

    public static void main(String[] args) {

        Student s = new Student("John Doe", "Alice Smith");
        s.displayNames();

    }

}