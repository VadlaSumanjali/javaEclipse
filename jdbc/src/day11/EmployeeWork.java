package day11;
class Employeee{
	public void work() {
		System.out.println("the employee works");
	}
}
class Developer extends Employeee{
	public void work() {
		System.out.println("developer writes the code");
	}
}
public class EmployeeWork {

	public static void main(String[] args) {
		Developer d=new Developer();
		d.work();

	}

}
