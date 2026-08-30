package oops;

import java.util.Scanner;
class Vehicle{
	String ownerName;
	String vechicleNumber;
	String vechicleType;
	public Vehicle(String ownerName, String vechicleNumber, String vechicleType) {
		super();
		this.ownerName = ownerName;
		this.vechicleNumber = vechicleNumber;
		this.vechicleType = vechicleType;
	}
}
class ServiceVehicle extends Vehicle{
	String serviceCentername;
	String serviceCategory;
	public ServiceVehicle(String ownerName, String vechicleNumber, String vechicleType, String serviceCentername,
			String serviceCategory) {
		super(ownerName, vechicleNumber, vechicleType);
		this.serviceCentername = serviceCentername;
		this.serviceCategory = serviceCategory;
	}
	public void updateServiceCategory(String serviceCategory) {
		this.serviceCategory=serviceCategory;
	}
	public void updateServiceCenterName(String serviceCentername) {
		this.serviceCentername=serviceCentername;
	}
	public void vechicalProfileDetails() {
		System.out.println("Vehicle Details");
		System.out.println("owner "+super.ownerName);
		System.out.println("vechical number "+super.vechicleNumber);
		System.out.println("vechical type "+super.vechicleType);
		System.out.println("service center "+serviceCentername);
		System.out.println("service category "+serviceCategory);
	}
}
public class OwnerShipService {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter owner name");
		String ownername=sc.nextLine();
		
		System.out.println("vechicla number");
		String vnumber=sc.nextLine();
		
		System.out.println("enter the vechicle type");
		String vtype=sc.nextLine();
		
		System.out.println("service center");
		String scenter=sc.nextLine();
		
		System.out.println("service category");
		String scategory=sc.nextLine();
		
		ServiceVehicle s=new ServiceVehicle(ownername, vnumber, vtype, scenter, scategory);
		
			System.out.println("\n--- Menu ---");
            System.out.println("1. Update Service Category");
            System.out.println("2. Update Service Center");
            System.out.println("3. View Profile");
            System.out.println("4. Exit");
         while(true) {

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    System.out.print("Enter new Service Category: ");
                    String newCategory = sc.nextLine();

                    s.updateServiceCategory(newCategory);
                    break;

                case 2:
                    System.out.print("Enter new Service Center Name: ");
                    String newCenter = sc.nextLine();

                    s.updateServiceCenterName(newCenter);
                    break;

                case 3:
                    s.vechicalProfileDetails();
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1 to 4.");
            }
		}
		

	}
}
