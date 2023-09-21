package Abstraction;

public class Driver {
    public static void main(String[] args) {
        BankAccount savingsAccount = new SavingsAccount();
        savingsAccount.deposit(1000);
        savingsAccount.withdraw(250);
        System.out.println(savingsAccount.getBalance());

        BankAccount checkingAccount = new CheckingAccount(1000);
        checkingAccount.deposit(2000);
        checkingAccount.withdraw(3000);
        System.out.println(checkingAccount.getBalance());

    }
}
