package encapsulation;

import java.util.Scanner;

class Product{
	private String productName;
	private int price;
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setPrice(int price) {
		if(price<0) {
			System.out.println("enter the correct price");
			return;
		}
		this.price = price;
	}
	public String getProductName() {
		return productName;
	}
	public int getPrice() {
		return price;
	}
	
}
public class ProductName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Product p=new Product();
		System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        int price = sc.nextInt();

        p.setProductName(name);
        p.setPrice(price);

        System.out.println("Product Name: " + p.getProductName());
        System.out.println("Price: " + p.getPrice());
		

	}

}
