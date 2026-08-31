package oops;

import java.util.Scanner;

class Patient{
	String patientName;
	String patientId;
	int age;
	public Patient(String patientName,String patientId,int age) {
		this.patientName=patientName;
		this.patientId=patientId;
		this.age=age;
	}
}
class InPatient extends Patient{
	int roomNumber;
	String disease;
	int admissionDays;
	public InPatient(String patientName, String patientId, int age, int roomNumber, String disease, int admissionDays) {
		super(patientName, patientId, age);
		this.roomNumber = roomNumber;
		this.disease = disease;
		this.admissionDays = admissionDays;
	}
	public void updateDisease(String dis) {
		if(dis.trim().isEmpty()) {
			System.out.println("enter the valid disease");
			return;
		}
		disease=dis;
	}
	public void roomNumber(int rnum) {
		if(rnum<0) {
			System.out.println("enter the valid number");
			return;
		}
		roomNumber=rnum;
	}
	public void viewPatientDetails() {
		System.out.println("hospital patient management");
		System.out.println("patient name "+super.patientName);
		System.out.println("patient id "+super.patientId);
		System.out.println("age "+super.age);
		System.out.println("room number "+roomNumber);
		System.out.println("disease "+disease);
		System.out.println("admission days "+admissionDays);
	}
	public void calculateBill(double roomcharge,int days) {
		if (roomcharge > 0 && days > 0) {
			double total = days * roomcharge;
			System.out.println("total bill " + total);
		} else {
			System.out.println("invalid input");
		}
	}
}
public class HospitalManagement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Patient ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Room Number: ");
        int room = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Disease: ");
        String disease = sc.nextLine();

        System.out.print("Enter Admission Days: ");
        int days = sc.nextInt();

		InPatient p = new InPatient(name, id, age, room, disease, days);
		
		System.out.println("\n------ Hospital Patient Management ------");
        System.out.println("1. Update Disease");
        System.out.println("2. Update Room Number");
        System.out.println("3. View Patient Details");
        System.out.println("4. Calculate Bill");
        System.out.println("5. Exit");
        
        int choice;
        
        while(true) {
        	System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

            case 1:
                System.out.print("Enter New Disease: ");
                String dis = sc.nextLine();

                p.updateDisease(dis);
                break;

            case 2:
                System.out.print("Enter New Room Number: ");
                int rnum = sc.nextInt();

                p.roomNumber(rnum);
                break;

            case 3:
                p.viewPatientDetails();
                break;

            case 4:
                System.out.print("Enter Room Charge Per Day: ");
                double charge = sc.nextDouble();

                System.out.print("Enter Number of Days: ");
                int billDays = sc.nextInt();

                p.calculateBill(charge, billDays); 
                break;

            case 5:
                System.out.println("Thank you. Exiting...");
                break;

            default:
                System.out.println("Invalid choice");
            }
        }


	}

}
