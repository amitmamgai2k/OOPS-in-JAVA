
package bank.current;

import bank.BankAccount;

public class CurrentAccount extends BankAccount {
    final double miniBalanceRequired = 1000.0;

    public CurrentAccount(String accountHolderName, int accountNumber, double balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= miniBalanceRequired) {
            balance -= amount;
            System.out.println("Rs " + amount + " Withdrawn.");
        } else {
            System.out.println("Balance should be greater than the minimum balance for withdrawal.");
        }
    }
}