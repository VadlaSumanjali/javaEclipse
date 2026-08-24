package threads;
class BankAccount{
	int balance=1000;
	public void withdraw(int amount) {
		synchronized (thid) {
			b.balance-=amount;
		}
	}
}
class W extends Thread{
	BankAccount b;

	 W(BankAccount b) {
		this.b = b;
	}
	
	
}
public class BalanceUpdate {

	public static void main(String[] args) {
		

	}

}
