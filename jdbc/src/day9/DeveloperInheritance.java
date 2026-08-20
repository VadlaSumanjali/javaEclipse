package day9;
class EmployeeSalaryInfo {
    String name;
    double salary;

    EmployeeSalaryInfo(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

class DeveloperInfo extends EmployeeSalaryInfo {
    double bonus;

    DeveloperInfo(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    void calculateSalary() {
        double finalSalary = salary + bonus;

        System.out.println("Employee: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Final Salary: " + finalSalary);
    }
}

public class DeveloperInheritance {
    public static void main(String[] args) {
        DeveloperInfo d = new DeveloperInfo("Kiran", 40000, 5000);
        d.calculateSalary();
    }
}