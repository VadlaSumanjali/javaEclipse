package oops;

import java.util.Scanner;

class Staff{
	private String staffName;
	private String staffId;
	private String baseShift;
	public Staff(String staffName,String staffId,String baseShift){
		this.staffName=staffName;
		this.staffId=staffId;
		this.baseShift=baseShift;
	}
	public void diaplayInfo() {
		System.out.println("name "+staffName);
		System.out.println("staff id "+staffId);
		System.out.println("department "+baseShift);
	}
	
}
class DepartmentStaff extends Staff{
    private String departmentName;
    private String responsibility;
	public DepartmentStaff(String staffName, String staffId, String baseShift, String departmentName,String responsibility) {
		super(staffName, staffId, baseShift);
		this.departmentName=departmentName;
		this.responsibility=responsibility;
	}
	public void  ResponsibilityLevel(String res) {
		if(res=="") {
			System.out.println("enter the vaild responsiblity");
			return;
		}
		responsibility=res;
	}
	public void DeparmentName(String dep) {
		if(dep=="") {
			System.out.println("enter the vaild department name");
			return;
		}departmentName=dep;
	}
	public void display() {
		System.out.println("staff details");
		diaplayInfo();
		System.out.println("department name "+departmentName);
		System.out.println("responsibility "+responsibility);
	}
	
}
public class HotelStaff {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Staff Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Staff ID: ");
		String id = sc.nextLine();

		System.out.print("Enter Base Shift: ");
		String shift = sc.nextLine();

		System.out.print("Enter Department Name: ");
		String department = sc.nextLine();

		System.out.print("Enter Responsibility Level: ");
		String responsibility = sc.nextLine();

		DepartmentStaff d =
		    new DepartmentStaff(name, id, shift, department, responsibility);

		System.out.println("Staff Profile Created");
		while(true) {
		System.out.println("--- Menu ---\r\n"
				+ " 1. Update Responsibility\r\n"
				+ " 2. Update Department\r\n"
				+ " 3. View Profile\r\n"
				+ " 4. Exit\r\n");
		int n=sc.nextInt();
		sc.nextLine();
		switch(n) {
		case 1:
			System.out.println("enter the updated responsibility");
			String s=sc.nextLine();
			d.ResponsibilityLevel(s);
			break;
		case 2:
			System.out.println("enter the updated department name");
			String s1=sc.nextLine();
			d.DeparmentName(s1);
			break;
		case 3:
			d.display();
			break;
		case 4:
			System.out.println("exiting...");
			return;
		default:
			System.out.println("enter the correct choice");
		}
		}

	}

}
