package oops;

import java.util.ArrayList;
import java.util.Scanner;
class StockHandler{
	String handleName;
	String handleId;
	public StockHandler(String handleName,String handleId) {
		this.handleName=handleName;
		this.handleId=handleId;
	}
}
class StockPerformance extends StockHandler{
	ArrayList<Integer> arr=new ArrayList<Integer>();
	int totalStock;
	float averageStock;
	String handlingGrade;
	public StockPerformance(String handleName,String handleId) {
		super(handleName,handleId);
		
	}
	public void addStock(int stock) {
		if (stock <= 0) {
            System.out.println("Invalid stock quantity.");
            return;
        }
		arr.add(stock);
		totalStock+=stock;
		recalculate();
	}
	public void recalculate() {
		totalStock=0;
		for(int i=0;i<arr.size();i++) {
			totalStock+=arr.get(i);
		}
		if (arr.size() > 0) {
            averageStock = (float) totalStock / arr.size();
        } else {
            averageStock = 0;
        }

        if (averageStock >= 40) {
            handlingGrade = "Efficient";
        } else {
            handlingGrade = "Needs Improvement";
        }
	}
	public void viewSummary() {
		System.out.println("stock performance profile is generated.");
		System.out.println("Stock Performance Summary");
	    System.out.println("Handler: " + super.handleName);
	    System.out.println("Handler ID: " + super.handleId);
        System.out.println("Total Stock Handled: " + totalStock);
	    System.out.println("Average Stock Per Entry: " + averageStock);
	    System.out.println("Handling Grade: " + handlingGrade);
	}
}
public class StoreEntry {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the handle name");
		String name=sc.nextLine();
		
		System.out.println("enter the handele id");
		String id=sc.nextLine();
		
		StockPerformance p=new StockPerformance(name, id);
		
		System.out.println("--- Menu ---\r\n"
				+ "1. Add Stock\r\n"
				+ "2. Recalculate Result\r\n"
				+ "3. View Summary\r\n"
				+ "4. Exit");
		while(true) {
			System.out.println("enter the choice");
			int n=sc.nextInt();
			switch(n) {
			case 1:
				System.out.println("enter stock quantity");
				int stock=sc.nextInt();
				p.addStock(stock);
				break;
			case 2:
				p.recalculate();
				break;
			case 3:
				p.viewSummary();
				break;
			case 4:
				System.out.println("thank you.............");
				sc.close();
				return;
			default: System.out.println("enter the valid choice");
			}
		   
			
			
		}

	}

}

