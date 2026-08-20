package day9;
class BankAccountInfo {
    int accountNo;
    double balance;

    BankAccountInfo(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }
}

class SavingsAccountInfo extends BankAccountInfo {
    double interestRate;

    SavingsAccountInfo(int accountNo, double balance, double interestRate) {
        super(accountNo, balance);
        this.interestRate = interestRate;
    }

    void calculateInterest() {
        double interest = balance * interestRate / 100;

        System.out.println("Account No: " + accountNo);
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + interest);
    }
}

public class BankInheritance {
    public static void main(String[] args) {
        SavingsAccountInfo s = new SavingsAccountInfo(101, 10000, 5);
        s.calculateInterest();
    }
}