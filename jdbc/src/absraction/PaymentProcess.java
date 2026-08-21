package absraction;
abstract class Payment{
	abstract void processPayment();
	abstract void validTransaction();
	public void generateTransactionId() {
	    System.out.println("Generated Transaction ID: ");
		
	}
}
class CreditCardPayment extends Payment{
	String cardNumber;
	String expiredDate;
	String cvv;
	

	public CreditCardPayment(String cardNumber, String expiredDate, String cvv) {
		super();
		this.cardNumber = cardNumber;
		this.expiredDate = expiredDate;
		this.cvv = cvv;
	}

	@Override
	void processPayment() {
		System.out.println("processing credit card payment");
	}

	@Override
	void validTransaction() {
		System.out.println("validating card number ,expiry and cvv");
	}
	public void generateTransactionId() {
		System.out.println("generated tarnsaction id:1234567890");
	}
	
}
class UpiPayment extends Payment{
	String upiId;
	String phoneNumber;
	public UpiPayment(String upiId, String phoneNumber) {
		super();
		this.upiId = upiId;
		this.phoneNumber = phoneNumber;
	}

	@Override
	void processPayment() {
		System.out.println("processing upi payment");
	}

	@Override
	void validTransaction() {
		System.out.println("validating upi id and phone number");
	}
	public void generateTransactionId() {
		System.out.println("generated tarnsaction id:675789");
	}
}
class PayPalPayment extends Payment {

    String email;
    String authToken;

    PayPalPayment(String email, String authToken) {
        super();
        this.email = email;
        this.authToken = authToken;
    }

    @Override
    void processPayment() {
        System.out.println("Processing PayPal payment.");
    }

    @Override
    void validTransaction() {
        System.out.println("Validating email and authentication token.");
    }
    public void generateTransactionId() {
		System.out.println("generated tarnsaction id: 987654321");
	}
}
public class PaymentProcess {

	public static void main(String[] args) {
		CreditCardPayment card =new CreditCardPayment("1234567890123456", "12/25", "123");

        card.processPayment();
        card.validTransaction();
        card.generateTransactionId();

        System.out.println();

        UpiPayment upi =new UpiPayment("suma@upi", "1234567890");

        upi.processPayment();
        upi.validTransaction();
        upi.generateTransactionId();

        System.out.println();

        PayPalPayment paypal =new PayPalPayment("user@example.com", "abc123");

        paypal.processPayment();
        paypal.validTransaction();
        paypal.generateTransactionId();
	}

}
