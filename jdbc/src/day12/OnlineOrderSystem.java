package day12;
abstract class Order {

    double price;

    Order(double price) {
        this.price = price;
    }

    abstract double calculateDeliveryCharge();

    abstract double calculateFinalAmount();
}

class RegularOrder extends Order {

    RegularOrder(double price) {
        super(price);
    }

    double calculateDeliveryCharge() {
        return 50;
    }

    double calculateFinalAmount() {
        return price + calculateDeliveryCharge();
    }
}

class ExpressOrder extends Order {

    ExpressOrder(double price) {
        super(price);
    }

    double calculateDeliveryCharge() {
        return 100;
    }

    double calculateFinalAmount() {
        return price + calculateDeliveryCharge();
    }
}

public class OnlineOrderSystem {

    public static void main(String[] args) {

        Order regular = new RegularOrder(1000);
        Order express = new ExpressOrder(1000);

        System.out.println(
            "Regular Order Final Amount: " + regular.calculateFinalAmount()
        );

        System.out.println(
            "Express Order Final Amount: " + express.calculateFinalAmount()
        );
    }
}