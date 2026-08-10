package Seta;

import java.util.Scanner;

class Vechicle{
	String ownerName;
	String vechicleNumber;
	String vechicleType;
	public Vechicle(String ownerName, String vechicleNumber, String vechicleType) {
		super();
		this.ownerName = ownerName;
		this.vechicleNumber = vechicleNumber;
		this.vechicleType = vechicleType;
	}
	
	
}
class ServiceVehical extends Vechicle{
	String serviceCenterName;
	String serviceCategory;
	public ServiceVehical(String ownerName,String vechicleNumber,String vechicleType,String serviceCenterName, String serviceCategory) {
		super(ownerName,vechicleNumber,vechicleType);
		this.serviceCenterName = serviceCenterName;
		this.serviceCategory = serviceCategory;
		System.out.println("vechicle profile has been created");
	}
	public void updateServiceCategory(String serviceCategory) {
		this.serviceCategory=serviceCategory;
		System.out.println("service category updated");
		
	}
	public void updateServiceCenter(String serviceCenter) {
		this.serviceCenterName=serviceCenter;
		System.out.println("service center name updated");
	}
	public void display() {
		System.out.println("owner name "+ownerName);
		System.out.println("vechical number "+vechicleNumber);
		System.out.println("vechical type "+vechicleType);
		System.out.println("service center name "+serviceCenterName);
		System.out.println("service category "+serviceCategory);
	}
	
}

public class OwnershipService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the owner name");
		String name=sc.nextLine();
		
		System.out.println("enter the vehicle number");
		String vnum=sc.nextLine();
		
		System.out.println("enter the vehicle type");
		String ctype=sc.nextLine();
		
		System.out.println("enter the service center name");
		String servicename=sc.nextLine();
		
		System.out.println("enter the  service category");
		String scategory=sc.nextLine();
		
		ServiceVehical sv=new ServiceVehical(name, vnum, ctype, servicename, scategory);
		
		boolean istrue=true;
		int choice=0;
		
		while(istrue){
			System.out.println(" 1.Update Service Category\r\n"
					+ "2 Update Service Center Name\r\n"
					+ "3 View Vehicle Profile Details\r\n"
					+ "4 Exit the program");
			
		
		System.out.println("enter the choice which you want");
		choice=sc.nextInt();
		sc.nextLine();
		switch (choice) {
		case 1: {
			System.out.println("enter the updated service category name");
			String s=sc.nextLine();
			if(s.equals("")) {
				System.out.println("enter the valid category");
			}else {
				sv.updateServiceCategory(s);
			}
			break;
			
		}
		case 2:{
			System.out.println("enter the update service center name");
			String s=sc.nextLine();
			if(s.equals("")) {
				System.out.println("enter the valid service");
			}else {
				sv.updateServiceCenter(s);
			}
			break;
			
		}
		case 3:{
			sv.display();
			break;
		}
		case 4:
			System.out.println("thankyou .....");
			istrue=false;
			break;
		default:System.out.println("enter the currect choice");
		}
	}
		

	}

}
