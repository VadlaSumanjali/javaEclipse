package oops;
class BankAccount{
	String accountHolderName;
	long accountNumber;
	double balance;
	public BankAccount(String accountHolderName, long accountNumber, double balance) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
}
class SavingAccount extends BankAccount{
	String accountType;
	double interestRate;
	public SavingAccount(String accountHolderName, long accountNumber, double balance, String accountType,
			double interestRate) {
		super(accountHolderName, accountNumber, balance);
		this.accountType = accountType;
		this.interestRate = interestRate;
	}
	public void depositAmount(int amount) {
		if(amount<=0) {
			System.out.println("enter the valid amount");
			return;
		}balance+=amount;
	}
}
public class BankSystem {
	public static void main(String[] args) {

	}

}
