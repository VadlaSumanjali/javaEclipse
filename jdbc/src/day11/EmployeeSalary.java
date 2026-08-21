package day11;
import java.util.*;
class Employee{
	public void calculateSalary() {
		System.out.println("employee salary");
	}
}
class Develeper extends Employee{
	int sal;
	
	public Develeper(int sal) {
		super();
		this.sal = sal;
	} 
	@Override
	public void calculateSalary() {
		System.out.println("the developer salary "+sal);
	}
}
class Managers extends Employee{
	int sal;
	
	public Managers(int sal) {
		super();
		this.sal = sal;
	} 
	@Override
	public void calculateSalary() {
		System.out.println("the manager salary "+sal);
	}
}
public class EmployeeSalary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the developer salary");
		int dev=sc.nextInt();
		System.out.println("enter the manger salary");
		int man=sc.nextInt();
		
		Develeper d=new Develeper(dev);
		Managers m=new Managers(man);
		
		d.calculateSalary();
		m.calculateSalary();

	}

}
