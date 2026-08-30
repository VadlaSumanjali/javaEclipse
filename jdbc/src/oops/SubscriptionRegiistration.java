package oops;

import java.util.*;
class SubscriptionPlan{
	String subscriberName;
	String planType;
	int planCost;
	double paidAmount;
	String subscriptionStatus;
	public  SubscriptionPlan() {
		this.subscriberName="unknown";
		this.planType="basic";
		this.planCost=0;
		this.paidAmount=0.0;
		this.subscriptionStatus="Active";
	}
	public  SubscriptionPlan(String subscriptionName,String planType) {
		this.subscriberName=subscriptionName;
		this.planType=planType;
		this.planCost=0;
		this.paidAmount=0.0;
		this.subscriptionStatus="Active";
	}
	public  SubscriptionPlan(String subscriptionName,String planType,int planCost) {
		this.subscriberName=subscriptionName;
		this.planType=planType;
		this.planCost=planCost;
		this.paidAmount=0.0;
		this.subscriptionStatus="Active";
	}
	public void updatePayment(int amount) {
		if(amount>0) {
			paidAmount=amount;
			System.out.println("amount updated");
		}else {
			System.out.println("enter valid amount");
		}
	}
	public void setStatus(String status) {
		if(status.trim().isEmpty()) {
			System.out.println("enter the valid status");
		}else {
			subscriberName=status;
		}
	}
	public void display() {
		System.out.println("\n--- Subscription Summary ---");
        System.out.println("Subscriber: " + subscriberName);
        System.out.println("Plan Type: " + planType);
        System.out.println("Plan Cost: " + planCost); 
        System.out.println("Paid Amount: " + paidAmount);
        System.out.println("Subscription Status: " + subscriptionStatus);
        System.out.println("----------------------------");
	}
}
public class SubscriptionRegiistration {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter Subscriber Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Plan Type: ");
        String type = sc.nextLine();
        System.out.print("Enter Plan Cost: ");
        int cost = sc.nextInt();
        
        SubscriptionPlan s=new SubscriptionPlan(name, type,cost);
        
        System.out.println("--- Menu ---\r\n"
        		+ "1. Update Payment\r\n"
        		+ "2. Change Status\r\n"
        		+ "3. View Summary\r\n"
        		+ "4. Exit");
        while(true) {

            System.out.println("enter the choice");

            int n = sc.nextInt();
            sc.nextLine();

            switch(n) {

            case 1:
                System.out.println("Enter payment amount:");
                int amount = sc.nextInt();
                sc.nextLine();

                s.updatePayment(amount);
                break;

            case 2:
                System.out.println("Enter subscription status:");
                String status = sc.nextLine();

                s.setStatus(status);
                break;

            case 3:
                s.display();
                break;

            case 4:
                System.out.println("Thank you.....");
                return;

            default:
                System.out.println("Invalid choice");
            }
        }
        

	}
}
