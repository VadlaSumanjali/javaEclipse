package encapsulation;

import java.util.Scanner;

class ATM {

    private int pin;
    private double balance;

    public ATM(int pin, double balance) {
        this.pin = pin;
        this.balance = balance;
    }

    public void checkBalance(int enteredPin) {

        if (enteredPin == pin) {
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Invalid PIN");
        }
    }

    public void deposit(int enteredPin, double amount) {

        if (enteredPin != pin) {
            System.out.println("Invalid PIN");
            return;
        }

        if (amount <= 0) {
            System.out.println("Deposit must be positive");
            return;
        }

        balance += amount;
    }

    public void withdraw(int enteredPin, double amount) {

        if (enteredPin != pin) {
            System.out.println("Invalid PIN");
            return;
        }

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

    public double getBalance() {
        return balance;
    }
}

public class Atm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();

        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();

        ATM atm = new ATM(pin, balance);

        System.out.print("Enter PIN to withdraw: ");
        int enteredPin = sc.nextInt();

        System.out.print("Enter Withdraw Amount: ");
        double amount = sc.nextDouble();

        atm.withdraw(enteredPin, amount);

        System.out.println("Remaining Balance: " + atm.getBalance());

        sc.close();
    }
}