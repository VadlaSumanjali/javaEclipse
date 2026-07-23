package Bank;


public class BankProcessor {

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount(101, "Rahul", 10000);

        System.out.println("Current Balance : " + b1.getBalance());

        b1.deposit(5000);
        System.out.println("After Deposit : " + b1.getBalance());

        b1.withDraw(3000);
        System.out.println("After Withdrawal : " + b1.getBalance());

        b1.withDraw(15000);
        System.out.println("Final Balance : " + b1.getBalance());
    }
}
