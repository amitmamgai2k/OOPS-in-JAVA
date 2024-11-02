package bank.savings;

import bank.BankAccount;

public class SavingAccount extends BankAccount {
    final double interestRate = 6;

    public SavingAccount(String accountHolderName, int accountNumber, double balance) {
        super(accountHolderName, accountNumber, balance);
    }

    public void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: Rs " + interest);
    }
}