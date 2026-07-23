package employee;

public class Employee {
	int empid;
	String name;
	String Designation;
	double salary;
	int PerformanceRating;
	
	public  Employee(int empid,String name,String Designation,double salary,int PerformanceRating){
		this.empid=empid;
		this.name=name;
		this.Designation=Designation;
		this.salary=salary;
		this.PerformanceRating=PerformanceRating;
	}
	public int getEmpid() {
		return empid;
	}
	public String getName() {
		return name;
	}
	public String getDesignation() {
		return Designation;
	}
	public Double getSalary() {
		return salary;
	} 
	public int getPerformanceRating() {
		return PerformanceRating;
	}
	public void setDesignation(String Designation) {
	    this.Designation = Designation;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public void promoteEmployee() {

	    if (PerformanceRating >= 4) {

	        salary = salary + (salary * 0.20);

	        if (Designation=="Junior Developer") {
	            Designation = "Developer";
	        }
	        else if (Designation=="Developer"){
	            Designation = "Senior Developer";
	        }
	        else if (Designation=="Senior Developer") {
	            Designation = "Team Lead";
	        }

	        System.out.println("Employee Promoted Successfully");
	    }
	    else {
	        System.out.println("Not Promoted");
	    }
	}
	public void show() { 
		System.out.println("empid"+empid);
		System.out.println("name"+name);
		System.out.println("designatiom"+Designation);
		System.out.println("salary"+salary);
	}

}
