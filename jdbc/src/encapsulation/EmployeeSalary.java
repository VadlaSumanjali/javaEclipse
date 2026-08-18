package encapsulation;
import java.util.*;
class Employee{
	private String name;
	private double salary;
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(double salary) {
		if(salary<0) {
			System.out.println("enter correct salry");
			return;
		}
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	
	
}
public class EmployeeSalary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        Employee e = new Employee();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        e.setName(name);
        e.setSalary(salary);

        System.out.println("\nEmployee: " + e.getName());
        System.out.println("Salary: " + e.getSalary());

        sc.close();

	}

}
