package Seta;

import java.util.ArrayList;
import java.util.Scanner;

class SalesEmployee{
	String employeeName;
	String employeeId;
	public SalesEmployee(String employeeName, String employeeId) {
		this.employeeName = employeeName;
		this.employeeId = employeeId;
	}
	
	
}
class PerformanceEmployee extends SalesEmployee{
	ArrayList<Double> listOfSalesEntries=new ArrayList<>();
	double totalSales;
	double averageSales; 
	String performanceGrade;
	public PerformanceEmployee(String employeeName, String employeeId) {
		super(employeeName, employeeId);
		System.out.println("Performance Profile Created");

	}
	public void addSales(double sales) {
		listOfSalesEntries.add(sales);
		totalSales+=sales;
		System.out.println("sales was updated");
	}
	public void recalculation() {
		if (listOfSalesEntries.isEmpty()) {
	        System.out.println("No sales entries found.");
	        return;
	    }
		averageSales = totalSales / listOfSalesEntries.size();
		if (averageSales >= 50000)
		    performanceGrade = "Excellent";
		else if (averageSales >= 25000)
		    performanceGrade = "Very Good";
		else if (averageSales >= 10000)
		    performanceGrade = "Good";
		else
		    performanceGrade = "Needs Improvement";
		System.out.println("recalculated total sales "+totalSales+" average sales "+averageSales);
	}
	public void display() {
		System.out.println("\nPerformance Summary");
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Total Sales: " + totalSales);
		System.out.println("Average Sales: " + averageSales);
		System.out.println("Performance Grade: " + performanceGrade);
	}
	
}

public class EnployeeSales {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Name:");
		String employeeName = sc.nextLine();

		System.out.println("Enter Employee ID:");
		String employeeId = sc.nextLine();
		
		PerformanceEmployee se=new PerformanceEmployee(employeeName, employeeId);
		
		boolean istrue=true;
		int choice=0;
		while(istrue) {
			System.out.println("\n----- MENU -----");
			System.out.println("1. Add Sales Entry");
			System.out.println("2. Recalculate Performance Result");
			System.out.println("3. View Performance Summary");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			
			choice=sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
			case 1:
				System.out.println("enter sales amount");
				double sales = sc.nextDouble();
				if (sales <= 0) {
				    System.out.println("Enter a valid sales amount.");
				} else {
				    se.addSales(sales);
				}break;
			case 2:
				se.recalculation();
				break;
			case 3:
				se.display();
				break;
			case 4:
				System.out.println("thankyou ...");
				istrue=false;
				break;
				
			default:System.out.println("Invalid Choice");
			}
			
			
		}

		

	}

}
