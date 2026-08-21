package day11;
class Bank{
	public void interest() {
		System.out.println("the bank has interst");
	}
}
class Saving extends Bank{
	public void interest() {
		System.out.println("saving account interest :6%");
	}
}
public class BankAccount {

	public static void main(String[] args) {
		Saving s=new Saving();
		s.interest();

	}

}
