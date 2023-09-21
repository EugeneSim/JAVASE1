package Abstraction.abstractionclasses;

public class Driver {
    public static void main(String[] args) {
        BankAccount savingsAccount = new SavingsAccount("SA001", 1000);
        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);
        System.out.println("Account Number: " + savingsAccount.getAccountNumber());
        System.out.println("Balance: " + savingsAccount.getBalance());

        BankAccount checkingAccount = new CheckingAccount("CA001", 2000, 1000);
        checkingAccount.deposit(1000);
        checkingAccount.withdraw(3000);
        System.out.println("Account Number: " + checkingAccount.getAccountNumber());
        System.out.println("Balance: " + checkingAccount.getBalance());
    }
}
