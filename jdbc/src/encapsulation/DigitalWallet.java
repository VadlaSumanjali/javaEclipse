package encapsulation;
package encapsulation;

import java.util.Scanner;

class Wallet {

    private double balance;

    public Wallet(double balance) {
        this.balance = balance;
    }

    public void addMoney(double amount) {

        if (amount <= 0) {
            System.out.println("Amount must be positive");
            return;
        }

        balance += amount;
    }

    public void spendMoney(double amount) {

        if (amount <= 0) {
            System.out.println("Amount must be positive");
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

public class DigitalWallet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();

        Wallet w = new Wallet(balance);

        System.out.print("Enter Add Money: ");
        double add = sc.nextDouble();

        w.addMoney(add);

        System.out.print("Enter Spend Money: ");
        double spend = sc.nextDouble();

        w.spendMoney(spend);

        System.out.println("Final Balance: " + w.getBalance());

        sc.close();
    }
}
