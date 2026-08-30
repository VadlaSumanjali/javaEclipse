package oops;
import java.util.*;
class User{
	String name;
	long mobileNumber;
	String email;
	public User(String name, long mobileNumber, String email) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.email = email;
	}
}
class Customer extends User{
	String customerType;
	public Customer(String name, long mobileNumber, String email,String customerType) {
		super(name, mobileNumber, email);
		this.customerType=customerType;
	}	
	public String getcustomerType() {
		return customerType;
	}
}
class Seller extends User{
	public Seller(String name, long mobileNumber, String email) {
		super(name, mobileNumber, email);
	}
}
class Product{
	private String productName;
	private double price;
	private int quantity;
	private String category;
	public Product(String productName, double price, int quantity, String category) {
		super();
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getProductName() {
		return productName;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	public String getCategory() {
		return category;
	}
}
abstract class Payment{
	public abstract void makePayment();
}
class Upi extends Payment{
	@Override
	public void makePayment() {
	   System.out.println("payment method : UPI");
	   System.out.println("Payment Status  : Payment Successful");
	}	
}
class CreditCard extends Payment{
	@Override
	public void makePayment() {
	   System.out.println("payment method : CreditCard");
	   System.out.println("Payment Status  : Payment Successful");
	}	
}
class DebitCard extends Payment{
	@Override
	public void makePayment() {
	   System.out.println("payment method : DebitCard");
	   System.out.println("Payment Status  : Payment Successful");
	}	
}
class order{
	int orderId;
	Customer customer;
	Product product;
	int quantity;
	public order(int orderId, Customer customer, Product product, int quantity) {
		super();
		this.orderId = orderId;
		this.customer = customer;
		this.product = product;
		this.quantity = quantity;
	}
	public void finalBill(int deliveryCharge,Payment payment) {
		double subtotal=product.getPrice()*quantity; 
		double discount;
		if(customer.getcustomerType().equals("Regular Customer")) {
			discount=subtotal*5/100;
		}else {
			discount=subtotal*10/100;
		}
		double finalamount=subtotal-discount+deliveryCharge;
		System.out.println("=======online shopping order========");
		System.out.println("order id :"+orderId);
		System.out.println("----customer details----");
		System.out.println("Name            : " + customer.name);
		System.out.println("Mobile Number   : " + customer.mobileNumber);
		System.out.println("Email           : " + customer.email);
		System.out.println("Customer Type   : " + customer.getcustomerType());

		System.out.println("----- Product Details -----");
		System.out.println("Product         : " + product.getProductName());
		System.out.println("Category        : " + product.getCategory());
		System.out.println("Price           : ₹" + product.getPrice());
		System.out.println("Quantity        : " + quantity);

		System.out.println("----- Payment Details -----");
		payment.makePayment();

		System.out.println("----- Bill Details -----");
		System.out.println("Subtotal        : ₹" + subtotal);
		System.out.println("Discount        : ₹" + discount);
		System.out.println("Delivery Charge : ₹" + deliveryCharge);
		System.out.println("--------------------------------");
		System.out.println("Final Amount    : ₹" + finalamount);
		System.out.println("====================================");
		System.out.println("Order placed successfully!");
	}

}
public class OnlineShopping {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Customer Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Mobile Number: ");
		long mobileNumber = sc.nextLong();
		sc.nextLine();

		System.out.print("Enter Email: ");
		String email = sc.nextLine();

		System.out.print("Enter Product Name: ");
		String productName = sc.nextLine();

		System.out.print("Enter Price: ");
		double price = sc.nextDouble();

		System.out.print("Enter Quantity: ");
		int productQuantity = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Category: ");
		String category = sc.nextLine();

		System.out.print("Enter Order ID: ");
		int orderId = sc.nextInt();

		System.out.println("Select Customer Type:");
		System.out.println("1. Regular Customer");
		System.out.println("2. Premium Customer");
		System.out.print("Enter Choice: ");
		int customerChoice = sc.nextInt();

		String customerType;

		if (customerChoice == 1) {
			customerType = "Regular Customer";
		} else {
			customerType = "Premium Customer";
		}

		Customer c = new Customer(name, mobileNumber, email, customerType);

		Product p = new Product(productName, price, productQuantity, category);

		System.out.println("Select Payment Method:");
		System.out.println("1. UPI");
		System.out.println("2. Credit Card");
		System.out.println("3. Debit Card");
		System.out.print("Enter Choice: ");
		int paymentChoice = sc.nextInt();

		Payment payment;

		if (paymentChoice == 1) {
			payment = new Upi();
		} else if (paymentChoice == 2) {
			payment = new CreditCard();
		} else {
			payment = new DebitCard();
		}

		System.out.print("Enter Delivery Charge: ");
		int deliveryCharge = sc.nextInt();

		order o = new order(orderId, c, p, productQuantity);

		o.finalBill(deliveryCharge, payment);

		sc.close();
		
	}
}
