package day9;
class EmployeeInfo {
    String name;
    double salary;

    EmployeeInfo(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

class ManagerInfo extends EmployeeInfo {
    String department;

    ManagerInfo(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    void display() {
        System.out.println("Employee: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}

public class ManagerInheritance {
    public static void main(String[] args) {
        ManagerInfo m = new ManagerInfo("Ravi", 30000, "IT");
        m.display();
    }
}
