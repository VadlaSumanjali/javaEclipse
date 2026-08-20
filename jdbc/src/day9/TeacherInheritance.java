package day9;
class PersonTeacherInfo {
    String name;
    int age;

    PersonTeacherInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class TeacherInfo extends PersonTeacherInfo {
    String subject;
    int experience;

    TeacherInfo(String name, int age, String subject, int experience) {
        super(name, age);
        this.subject = subject;
        this.experience = experience;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
        System.out.println("Experience: " + experience + " Years");
    }
}

public class TeacherInheritance {
    public static void main(String[] args) {
        TeacherInfo t = new TeacherInfo("Ramesh", 35, "Java", 8);
        t.display();
    }
}