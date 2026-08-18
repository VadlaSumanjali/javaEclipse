package encapsulation;

import java.util.Scanner;

class Bank {

    private double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Deposit must be positive");
            return;
        }

        balance += amount;
    }

    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Withdrawal must be positive");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance");
            return;
        }

        balance -= amount;
    }
}

public class BankAccount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();

        Bank account = new Bank(balance);

        System.out.print("Enter Deposit: ");
        double deposit = sc.nextDouble();

        account.deposit(deposit);

        System.out.print("Enter Withdraw: ");
        double withdraw = sc.nextDouble();

        account.withdraw(withdraw);

        System.out.println("Final Balance: " + account.getBalance());

        sc.close();
    }
}