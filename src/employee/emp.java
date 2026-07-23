package employee;

public class emp {
	
	int empid;
	String name;
	String Designation;
	Double salary;
	
	public  emp(int empid,String name,String Designation,Double salary){
		this.empid=empid;
		this.name=name;
		this.Designation=Designation;
		this.salary=salary;
	}
	public void Getemp() {
		System.out.print("empid"+empid+"  name  "+name+"  designation  "+Designation+"  salary  "+salary);
		
	}

}
