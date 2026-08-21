package absraction;
abstract class Employee{
	String name;
	int id;
	
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	abstract void calculateSalary();
	public void applyLeave() {
		System.out.println("leave applied succesfully");
	}
	public void getDetails() {
		System.out.println("employee details "+name+" id: "+id);
	}
}
class FullTimeEmployee extends Employee{
	int basePay;
	int benefits;
	public FullTimeEmployee(String name, int id, int basePay, int benefits) {
		super(name, id);
		this.basePay = basePay;
		this.benefits = benefits;
	}
	public void calculateSalary() {
		System.out.println("calculated salary "+(basePay+benefits));
	}
}
class PartTimeEmployee extends Employee {

    int hourlyRate;
    int hoursWorked;

    public PartTimeEmployee(String name, int id, int hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Calculated salary: " + (hourlyRate * hoursWorked));
    }
}
class Freelancer extends Employee {

    int projectPayment;

    public Freelancer(String name, int id, int projectPayment) {
        super(name, id);
        this.projectPayment = projectPayment;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Calculated salary: " + projectPayment);
    }
}
public class EmployeePayroll {
	public static void main(String[] args) {
		FullTimeEmployee fullTime =new FullTimeEmployee("John", 101, 50000, 5000);

        fullTime.calculateSalary();
        fullTime.applyLeave();
        fullTime.getDetails();

        System.out.println();

        PartTimeEmployee partTime = new PartTimeEmployee("Sam", 102, 500, 20);

        partTime.calculateSalary();
        partTime.applyLeave();
        partTime.getDetails();

        System.out.println();

        Freelancer freelancer =new Freelancer("Alice", 103, 60000);

        freelancer.calculateSalary();
        freelancer.applyLeave();
        freelancer.getDetails();
	}

}
