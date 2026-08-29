package oops;
import java.util.*;
class User{
	private String name;
	private long mobileNumber;
	private String email;
	
	public User(String name, long mobileNumber, String email) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	
}
class Customer extends User{
	private String customerType;
	public Customer(String name, long mobileNumber, String email,String customerType) {
		super(name, mobileNumber, email);
		this.customerType=customerType;
	}
	public String getCustomerType() {
		return customerType;
	}
}
class DeliveryPartner extends User{

	public DeliveryPartner(String name, long mobileNumber, String email) {
		super(name, mobileNumber, email);
	}
	
}
class Restaurant{
	private String restaurantName;
	private String location;
	private double rating;
	public Restaurant(String restaurantName, String location, double rating) {
		super();
		this.restaurantName = restaurantName;
		this.location = location;
		this.rating = rating;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName=restaurantName;
	}
	public void setLocation(String location) {
		this.location=location;
	}
	public void setRating(double rating) {
		this.rating=rating;
	}
	public String getRestaurantName() {
		return  restaurantName;
	}
	public String getLocation() {
		return location;
	}
	public double getRating() {
		return rating;
	}
}
abstract class Payment{
	public abstract void makePayment();
	public abstract String getPaymentMethodName();
}
class UPI extends Payment {
    @Override
    public void makePayment() {
        System.out.println("Payment Successful");
    }public String getPaymentMethodName() {
    	return "UPI"; 
    }
}
class CreditCard extends Payment {
    @Override
    public void makePayment() {
        System.out.println("Payment Successful");
    }public String getPaymentMethodName() {
    	return "CreditCard"; 
    }
}
class CashOnDelivery extends Payment {
    @Override
    public void makePayment() {
        System.out.println("Payment will be collected on delivery");
    }public String getPaymentMethodName() {
    	return "CashOnDelivery"; 
    }
}
class Order{
	private int orderId;
	private Customer customer;
	private Restaurant restaurant;
	int orderAmount;
	
	public Order(int orderId, Customer customer, Restaurant restaurant, int orderAmount) {
		super();
		this.orderId = orderId;
		this.customer = customer;
		this.restaurant = restaurant; 
		this.orderAmount = orderAmount;
	}
	public void processOrder(int deliveryCharge,Payment payment) {
		double discounts = 0;
	    if (customer.getCustomerType().equals("Premium Customer")) {
	        discounts = orderAmount * 0.10; 
	    } else {
	        discounts = orderAmount * 0.05;
	    }
	    double finalAmount = orderAmount - discounts + deliveryCharge;
	    System.out.println("Order ID: " + orderId);
	    System.out.println("Customer: " + customer.getName());
	    System.out.println("Restaurant: " + restaurant.getRestaurantName());
	    payment.makePayment(); 
	    System.out.println("Order Amount: " + orderAmount);
	    System.out.println("Discount: " + discounts);
	    System.out.println("Final Bill: " + finalAmount);
	}
}       
public class FoodDelivery {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // 1. Customer Details
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Mobile Number: ");
        long mobile = sc.nextLong();
        sc.nextLine(); // clear buffer
        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        // 2. Restaurant Details
        System.out.print("Enter Restaurant Name: ");
        String resName = sc.nextLine();
        System.out.print("Enter Location: ");
        String loc = sc.nextLine();
        System.out.print("Enter Rating: ");
        double rating = sc.nextDouble();

        System.out.print("Enter Order ID: ");
        int oid = sc.nextInt();
        System.out.print("Enter Order Amount: ");
        int amount = sc.nextInt();

        System.out.println("Select Customer Type:\n1. Regular Customer\n2. Premium Customer");
        System.out.print("Enter Choice: ");
        int typeChoice = sc.nextInt();
        String type = (typeChoice == 2) ? "Premium Customer" : "Regular Customer";

        System.out.println("Select Payment Method:\n1. UPI\n2. Credit Card\n3. Cash On Delivery");
        System.out.print("Enter Choice: ");
        int payChoice = sc.nextInt();
        Payment payment;
        if (payChoice == 2) payment = new CreditCard();
        else if (payChoice == 3) payment = new CashOnDelivery();
        else payment = new UPI();
        System.out.print("Enter Delivery Charge: ");
        int delCharge = sc.nextInt();
        Customer customer = new Customer(name, mobile, email, type);
        Restaurant restaurant = new Restaurant(resName, loc, rating);
        Order order = new Order(oid, customer, restaurant, amount);

        order.processOrder(delCharge, payment);

        sc.close();

	}

}
