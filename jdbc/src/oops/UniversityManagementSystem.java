package oops;
abstract class Employee{
	private String employeeId;
	private String name;
	Employee(String employeeId,String name){
		this.employeeId=employeeId;
		this.name=name;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public String getName() {
		return name;
	}
	public abstract double calculateSalary();
	public abstract void displayDetails();
	public void printBasicInfo() {
		System.out.println("employeeId "+employeeId);
		System.out.println("name "+name);
	}
	
}
class FacultyMember extends Employee{
	private int department;
	private int yearsOfService;
	public FacultyMember(String employeeId,String name,int department,int yearOfService) {
		super(employeeId,name);
		this.department=department;
		this.yearsOfService=yearOfService;
	}
	public int getDepartment() {
		return department;
	}
	public int getYearOfService() {
		return yearsOfService;
	}
	@Override
	public double calculateSalary() {
		int salary=50000;
		double res=salary+(1000*yearsOfService);
		return res;
	}
	@Override
	public void displayDetails() {
		System.out.println("employee Details");
		printBasicInfo();
		System.out.println("department "+department);
		System.out.println("yearsOfService "+yearsOfService);
		System.out.println("monthly salary "+ calculateSalary() );
		System.out.println();
	}
	
}
class StaffMember extends Employee{
	private String designation;
	private double overtimeHours;
	public StaffMember(String employeeId,String name,String designation,double overtimeHourse){
		super(employeeId,name);
		this.designation=designation;
		this.overtimeHours=overtimeHourse;
	}
	public String getDesignation() {
		return designation; 
	}
	public double getOvertimeHours() {
		return overtimeHours; 
	}
	@Override 
	public double calculateSalary() {
		int salary=40000;
		double res=salary+(25*overtimeHours);
		return res;
	}
	
	@Override
	public void displayDetails() {
		System.out.println("employee Details");
		printBasicInfo();
		System.out.println("designation "+designation);
		System.out.println("overtimetime "+overtimeHours);
		System.out.println("monthly salary "+ calculateSalary());
		System.out.println();
	}
}

public class UniversityManagementSystem {

	public static void main(String[] args) {
		FacultyMember f=new FacultyMember("F001","john Smith", 101,5 );
		
		StaffMember s=new StaffMember("s001", "jane Doe", "administrator",20.0 );
	    Employee[] e= {f,s};
		for(Employee s1:e) {
			s1.displayDetails();
		}
	}

}
