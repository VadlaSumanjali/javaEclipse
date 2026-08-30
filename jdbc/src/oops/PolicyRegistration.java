package oops;
import java.util.*;
class InsurancePolicy{
	String customerName;
	String policyType;
	Double policyAmount;
	Double approvedAmount;
	String policyStatus;
	public InsurancePolicy(String customerName,String policyType,Double policyAmount) {
		this.customerName=customerName;
		this.policyType=policyType;
		 if (policyAmount == null || policyAmount < 0) {
		        this.policyAmount = 0.0;
		} else {
		        this.policyAmount = policyAmount;
		    }
		approvedAmount=0.0;
		policyStatus="Pending";
	}
	public InsurancePolicy(String customerName,String policyType) {
		this.customerName=customerName;
		this.policyType=policyType;
		policyAmount=0.0;
		approvedAmount=0.0;
		policyStatus="Pending";
	}
	public InsurancePolicy(String customerName) {
		this.customerName=customerName;
		this.policyType="none";
		policyAmount=0.0;
		approvedAmount=0.0;
		policyStatus="Pending";
	}
	public InsurancePolicy() {
		this.customerName="none";
		this.policyType="none";
		policyAmount=0.0;
		approvedAmount=0.0;
		policyStatus="Pending";
	}
	public void updateApprovedAmount(double amount) {
		if(amount<0) {
			System.out.println("enter the valid amount");
			return;
		}if(policyAmount<amount) {
			System.out.println("enter the correct amount");
			return;
		}policyStatus="approvied";
		approvedAmount=amount;
	}
	public void policyStatus(String status) {
		if(status.trim().isEmpty()) {
			System.out.println("enter the valid status");
			return; 
		}
		policyStatus=status;
	}
	public void viewSummary() {

	    System.out.println("\nPolicy Summary");
	    System.out.println("Customer: " + customerName);
	    System.out.println("Policy Type: " + policyType);
	    System.out.println("Policy Amount: " + policyAmount);
	    System.out.println("Approved Amount: " + approvedAmount);
	    System.out.println("Policy Status: " + policyStatus);
	}
	
	
}
public class PolicyRegistration {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter Policy Type: ");
        String policyType = sc.nextLine();

        System.out.print("Enter Policy Amount: ");
        double policyAmount = sc.nextDouble();
        sc.nextLine();

        InsurancePolicy p = new InsurancePolicy(
                customerName,
                policyType,
                policyAmount
        );

        System.out.println("\nPolicy Profile Created");

        int choice;

        do {

            System.out.println("\n--- Menu ---");
            System.out.println("1. Update Approved Amount");
            System.out.println("2. Change Policy Status");
            System.out.println("3. View Summary");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {

                case 1:
                    System.out.print("Enter Approved Amount: ");
                    double amount = sc.nextDouble();
                    sc.nextLine();

                    p.updateApprovedAmount(amount);
                    break;

                case 2:
                    System.out.print("Enter Policy Status: ");
                    String status = sc.nextLine();

                    p.policyStatus(status);
                    break;

                case 3:
                    p.viewSummary();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while(choice != 4);

        sc.close();
    }
}

