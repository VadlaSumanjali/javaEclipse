package day9;
class PersonLevel {
    String name;

    PersonLevel(String name) {
        this.name = name;
    }
}

class EmployeeLevel extends PersonLevel {
    double salary;

    EmployeeLevel(String name, double salary) {
        super(name);
        this.salary = salary;
    }
}

class ManagerLevel extends EmployeeLevel {
    String department;

    ManagerLevel(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        ManagerLevel m =
                new ManagerLevel("Ravi", 60000, "Development");

        m.display();
    }
}