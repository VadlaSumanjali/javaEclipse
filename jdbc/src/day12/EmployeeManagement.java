package day12;

abstract class Employee {

    abstract void calculateSalary();
}

class Developer extends Employee {

    void calculateSalary() {
        System.out.println("Developer Salary: 50000");
    }
}

class Manager extends Employee {

    void calculateSalary() {
        System.out.println("Manager Salary: 70000");
    }
}

public class EmployeeManagement {

    public static void main(String[] args) {

        Employee e1 = new Developer();
        Employee e2 = new Manager();

        e1.calculateSalary();
        e2.calculateSalary();
    }
}