package Inheritance;

class Employee{
	int sal=50000;
}
public class Manager extends Employee {
	int man=20000;

	public static void main(String[] args) {
		Manager m=new Manager();
		System.out.println(m.sal+m.man);

	}

}
