package interface1;

public  interface Payment {
	int amount=0;
	void pay(int amonut);

}
class CreditCard implements Payment{

	@Override
	public void pay(int amount) {
		System.out.println("2% discount on creditcard"+(amount*0.02));
		
	}
	
}
class DeditCard implements Payment{

	@Override
	public void pay(int amount) {
		System.out.println(" no discount on debitcard"+amount);
		
	}
	
}
class Cash implements Payment{

	@Override
	public void pay(int amount) {
		System.out.println("no discount on cash"+amount);
		
	}
	
}
class UPI implements Payment{ 

	@Override
	public void pay(int amount) {
		System.out.println("no discount on UPI"+amount);
		
	}
	  
} 
public class Demo {
	public static void main(String[] args) {
		Payment p;
		p=new CreditCard();
		p.pay(1200);
		
	}
	
}

