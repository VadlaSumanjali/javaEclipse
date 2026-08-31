package oops;

import java.util.*;
import java.util.ArrayList;

class SalesEmployee {
	String employeeName;
	String employeeId;

	public SalesEmployee(String employeeName, String employeeId) {
		this.employeeName = employeeName;
		this.employeeId = employeeId;
	}
}

class PerformanceEmployee extends SalesEmployee {
	ArrayList<Integer> sales = new ArrayList<>();
	double total;
	double averageSales;
	String grade;

	public PerformanceEmployee(String employeeName, String employeeId) {
		super(employeeName, employeeId);
	}

	public void addSalesEntry(int sale) {
		if (sale < 0) {
			System.out.println("enter the valid amount");
			return;
		}
		sales.add(sale);
		recalculate();
	}

	public void recalculate() {
		if (sales.size() == 0) {
			System.out.println("No sales entries available.");
			return;
		}
		total = 0;
		for (int i = 0; i < sales.size(); i++) {
			total += sales.get(i);
		}
		averageSales = total / sales.size();
		if (averageSales >= 15000) {
			grade = "Excellent";
		} else if (averageSales >= 10000) {
			grade = "Good";
		} else {
			grade = "Needs Improvement";
		}
	}

	public void viewSummary() {

		System.out.println("\nPerformance Summary");
		System.out.println("Employee: " + employeeName);
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Total Sales: " + total);
		System.out.println("Average Sales: " + averageSales);
		System.out.println("Performance Grade: " + grade);
	}
}

public class TrackingPerformance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Employee Name: ");
		String employeeName = sc.nextLine();

		System.out.print("Enter Employee ID: ");
		String employeeId = sc.nextLine();

		PerformanceEmployee p = new PerformanceEmployee(employeeName, employeeId);

		System.out.println("\nPerformance Profile Created");
		System.out.println("\n--- Menu ---");
		System.out.println("1. Add Sales");
		System.out.println("2. Recalculate Result");
		System.out.println("3. View Summary");
		System.out.println("4. Exit");
		while (true) {

			System.out.print("Enter choice: ");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.print("Enter Sales Amount: ");
				int sale = sc.nextInt();

				p.addSalesEntry(sale);
				break;

			case 2:
				p.recalculate();
				break;

			case 3:
				p.viewSummary();
				break;

			case 4:
				System.out.println("Exiting...");
				return;

			default:
				System.out.println("Invalid choice");
			}

		}

	}

}
