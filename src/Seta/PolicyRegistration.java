package Seta;
import java.util.*;
class InsurancePolicy{
	private String CustomerName;
	private String PolicyType;
	private double PolicyAmount;
	private double ApprovedAmount;
	private String PolicyStatus;
	public InsurancePolicy() {
		 CustomerName = "";
	     PolicyType = "";
	     PolicyAmount = 0;
	     ApprovedAmount = 0;
	     PolicyStatus = "Pending";
	}
	public InsurancePolicy(String customerName, String policyType,double policyAmount) {
		this.CustomerName = customerName;
		this.PolicyType = policyType;
		if(policyAmount>0) {
			this.PolicyAmount=policyAmount;
		}else {
            System.out.println("Invalid policy amount provided. Setting policy amount to 0.0");
            this.PolicyAmount = 0.0;

		}
		this.ApprovedAmount=0.0;
		this.PolicyStatus="pending";
		System.out.println("policy record is created");
	}
	public void UpdateApprovedAmount(double amount) {
		this.ApprovedAmount=amount;
		System.out.println("amount updated ");
		display();
	}
	public void ChangePolicyStatus(String status) {
		this.PolicyStatus=status;
		System.out.println("status updated");
		display();
	}
	public void display() {
		System.out.println("Customer: " + CustomerName);
		System.out.println("Policy Type: " + PolicyType);
		System.out.println("Policy Amount: " + PolicyAmount);
		System.out.println("Approved Amount: " + ApprovedAmount);
		System.out.println("Policy Status: " + PolicyStatus);

	}
	
	
}
public class PolicyRegistration {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the name");
		String name=sc.nextLine();
		
		System.out.println("enter the policy type");
		String type=sc.nextLine();
		
		System.out.println("enter the policy amount");
		int pamount=sc.nextInt();
		
		
		InsurancePolicy ip=new InsurancePolicy(name,type,pamount);
		Boolean istrue=true;
		int key;
		while(istrue) {
			System.out.println("1. Update Approved Amount\r\n"
					+ "2. Change Policy Status\r\n"
					+ "3. View Policy Summary\r\n"
					+ "4. Exit the program\r\n"
					+ "");
			key=sc.nextInt();
			switch (key) {
			case 1: {
				System.out.println("enter the updated approved amount");
				double amount=sc.nextDouble();
				if(amount<=0) {
					System.out.println("enter the valid amount");
				}else {
					ip.UpdateApprovedAmount(amount);
				}
				break;
			} 
			case 2:{
				System.out.println("enter the status");
				sc.nextLine();
				String status=sc.nextLine();
				if(status.equals("")) {
					System.out.println("enter the valid status");
				}else {
					ip.ChangePolicyStatus(status);
				}break;
			}
			case 3:{
				ip.display();
				break;
			}
			case 4:
				System.out.println("thank you");
				istrue=false;
				break;
			default:System.out.println("enter the valid choice");
			}
			
		}
		

	}

}
