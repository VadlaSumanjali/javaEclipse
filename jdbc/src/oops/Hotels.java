package oops;

import java.util.Scanner;

class Staff{
	String staffName;
	String staffId;
	String baseShift;
	public Staff(String staffName,String staffId,String baseShift) {
		this.staffName=staffName;
		this.staffId=staffId;
		this.baseShift=baseShift;
	}
}
class DepartmentStaff extends Staff{
	String departmentName;
	String resLevel;
	public DepartmentStaff(String staffName, String staffId, String baseShift, String departmentName, String resLevel) {
		super(staffName, staffId, baseShift);
		this.departmentName = departmentName;
		this.resLevel = resLevel;
	}
	public void updateDepartmentName(String dep) {
		departmentName=dep;
	}
	public void updateresLevel(String res) {
		resLevel=res;
	}
	public void display() {
		System.out.println("staff details");
		System.out.println("name : "+super.staffName);
		System.out.println("staff id : "+super.staffId);
		System.out.println("department : "+departmentName);
		System.out.println("responsibility : "+resLevel);
		System.out.println("shift : "+super.baseShift);
	}
}
public class Hotels {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter staff name");
		String n=sc.nextLine();
		
		System.out.println("enter staff id ");
		String id=sc.nextLine();
		
		System.out.println("enter the base shift ");
		String shift=sc.nextLine();
		
		System.out.println("enter department name ");
		String depart=sc.nextLine();
		
		System.out.println("enter respaonsibility level ");
		String ress=sc.nextLine();
		
		DepartmentStaff d=new DepartmentStaff(n, id, shift, depart, ress);
		
		System.out.println("--- Menu ---\r\n"
				+ "1. Update Responsibility\r\n"
				+ "2. Update Department\r\n"
				+ "3. View Profile\r\n"
				+ "4. Exit\r\n");
		
		while(true) {
			System.out.println("enter the choice");
			int c=sc.nextInt();
			sc.nextLine();
			
			switch (c) {
			case 1: 
				System.out.println("enter the updated responsibility");
				String re=sc.nextLine();
				if(re.trim().isEmpty()) {
					System.out.println("enter the valid responsibility");
					return;
				}d.updateresLevel(re);
				break;
			case 2:
				System.out.println("enter the update department");
				String de=sc.nextLine();
				if(de.trim().isEmpty()) {
					System.out.println("enter the valid department");
					return;
				}
				d.updateDepartmentName(de);
				break;
			case 3:
				d.display();
				break;
			case 4:
				System.out.println("thankyou.....");
				return;
			default:
				throw new IllegalArgumentException("Unexpected value: ");
			}
		}

	}

}
