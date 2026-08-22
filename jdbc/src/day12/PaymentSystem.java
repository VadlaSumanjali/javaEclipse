package day12;
abstract class Payment {

    abstract void pay(double amount);
}

class UPIPayment extends Payment {

    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " through UPI");
    }
}

class CardPayment extends Payment {

    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " through Card");
    }
}

class CashPayment extends Payment {

    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " through Cash");
    }
}

public class PaymentSystem {

    public static void main(String[] args) {

        Payment p;

        p = new UPIPayment();
        p.pay(1000);

        p = new CardPayment();
        p.pay(1000);

        p = new CashPayment();
        p.pay(1000);
    }
}