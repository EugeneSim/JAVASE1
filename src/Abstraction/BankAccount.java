package Abstraction;

public interface BankAccount {
    void deposit(double amt);

    void withdraw(double amt);

    double getBalance();
}