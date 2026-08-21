package day11;
class Payment{
	public void pay() {
		System.out.println("the upi class");
	}
}
class UPIPayment extends Payment{
	public void pay() {
		System.out.println("Payment through UPI");
	}
}
class CardPayment extends Payment{
	public void pay() {
		System.out.println("Payment through casd");
	}
}
class CashPayment extends Payment{
	public void pay() {
		System.out.println("Payment through cash");
	}
}
public class PaymentSystem {

	public static void main(String[] args) {
		UPIPayment u=new UPIPayment();
		u.pay();
		
		CardPayment c=new CardPayment();
		c.pay();
		
		CashPayment cs=new CashPayment();
		cs.pay();

	}

}
