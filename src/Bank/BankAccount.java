package Bank;

public class BankAccount {
	private int accountNumber;
	private String accountHolder;
	private double balance;
	public BankAccount(int accountNumber,String accountHolder,double balance) {
		this.accountNumber=accountNumber;
		this.accountHolder=accountHolder;
		this.balance=balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposit(double amount) {
		balance+=amount;
	}
	public void withDraw(double amount) {
		if(balance>=amount) {
			balance-=amount;
		}else {
			System.out.println("insufficient balance");
		}
	}
	

	

}
