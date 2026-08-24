package day14;
import java.util.ArrayList;

class Product {

    private int productId;
    private String productName;
    private double price;
    private int quantity;

    Product(int productId, String productName, double price, int quantity) {

        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
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

    public double getProductTotal() {
        return price * quantity;
    }
}

class ShoppingCart {

    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(int productId) {

        for (Product p : products) {

            if (p.getProductId() == productId) {
                products.remove(p);
                System.out.println("Product removed.");
                return;
            }
        }

        System.out.println("Product not found.");
    }

    public double calculateTotal() {

        double total = 0;

        for (Product p : products) {
            total += p.getProductTotal();
        }

        return total;
    }

    public void displayCart() {

        for (Product p : products) {

            System.out.println(
                p.getProductName() +
                " - ₹" + p.getPrice() +
                " x " + p.getQuantity()
            );
        }

        double total = calculateTotal();

        double discount = 0;

        if (total >= 5000) {
            discount = total * 0.20;
        }
        else if (total >= 3000) {
            discount = total * 0.10;
        }

        double finalAmount = total - discount;

        System.out.println("----------------------");
        System.out.println("Cart Total: ₹" + total);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Amount: ₹" + finalAmount);
    }
}

public class ShoppingCartDemo {

    public static void main(String[] args) {

        Product laptop =
            new Product(1, "Laptop", 40000, 1);

        Product mouse =
            new Product(2, "Mouse", 1000, 1);

        Product keyboard =
            new Product(3, "Keyboard", 2000, 1);

        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(laptop);
        cart.addProduct(mouse);
        cart.addProduct(keyboard);

        cart.displayCart();

        cart.removeProduct(2);

        System.out.println("\nAfter removing Mouse:");
        cart.displayCart();
    }
}
