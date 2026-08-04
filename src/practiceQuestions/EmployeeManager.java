package practiceQuestions;
class Employee{
	Employee(){
		System.out.println("Employee created");
	}
}
class Manager extends Employee{
	Manager(){
		super();
		System.out.println("manager created");
	}
}

public class EmployeeManager {

	public static void main(String[] args) {
		new Manager();

	}

}
