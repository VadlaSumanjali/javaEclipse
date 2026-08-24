package interface1;
interface Bank{
	public void deposit();
	public void withdraw();
	public void chaeckBalance();
}
class SBI implements Bank{

	@Override
	public void deposit() {
		System.out.println("sdi deposite");
		
	}

	@Override
	public void withdraw() {
		System.out.println("sdi withdraw");
	}

	@Override
	public void chaeckBalance() {
		System.out.println("sbi check balance");
	}

	
	
}
class Hdfc implements Bank{

	@Override
	public void deposit() {
		System.out.println("hdfc deposite");
		
	}

	@Override
	public void withdraw() {
		System.out.println("hdfc withdraw");
	}

	@Override
	public void chaeckBalance() {
		System.out.println("hdfc check balance");
	}

	
	
}
class Icici implements Bank{

	@Override
	public void deposit() {
		System.out.println("Icici deposite");
		
	}

	@Override
	public void withdraw() {
		System.out.println("Icici withdraw");
	}

	@Override
	public void chaeckBalance() {
		System.out.println("Icici check balance");
	}

	
}
public class BankOperations {

	public static void main(String[] args) {
		Bank b;

		b = new SBI();
		b.deposit(); 
		b.withdraw();
		b.chaeckBalance();

		b = new Hdfc();
		b.deposit();
		b.withdraw();
		b.chaeckBalance();

		b = new Icici();
		b.deposit();
		b.withdraw();
		b.chaeckBalance();
//		SBI s=new SBI();
//		s.deposit();
//		s.withdraw();
//		s.chaeckBalance();
//		
//		Hdfc h=new Hdfc();
//		h.deposit();
//		h.withdraw();
//		h.chaeckBalance();
//		
//		Icici i=new Icici();
//		i.deposit();
//		i.withdraw();
//		i.chaeckBalance();

	}

}
