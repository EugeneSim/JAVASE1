package Abstraction;

public class CheckingAccount implements BankAccount {
    private double balance;
    private double overDraftLimit;

    public CheckingAccount(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public void deposit(double amt) {
        balance += amt;
    }

    @Override
    public void withdraw(double amt) {
        if (balance + overDraftLimit >= amt) {
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