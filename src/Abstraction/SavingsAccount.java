package Abstraction;

public class SavingsAccount implements BankAccount {
    private double balance;

    @Override
    public void deposit(double amt) {
        balance += amt;
    }

    @Override
    public void withdraw(double amt) {
        if (balance > amt) {
            balance -= amt;
        } else {
            System.out.println("Insufficient Funds.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

}
