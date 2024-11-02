import bank.savings.SavingAccount;
import bank.current.CurrentAccount;

public class Question8 {
    public static void main(String[] args) {
        // Creating a savings account
        SavingAccount savingAccount = new SavingAccount("Amit", 112345, 2000.0);
        System.out.println("\n--- Saving Account ---");
        savingAccount.showBalance();
        savingAccount.deposit(1000.0);
        savingAccount.addInterest();
        savingAccount.showBalance();

        // Creating a current account
        CurrentAccount currentAccount = new CurrentAccount("Ruka", 2116404524, 1800);
        System.out.println("\n--- Current Account ---");
        currentAccount.showBalance();
        currentAccount.withdraw(1000);
        currentAccount.withdraw(500);
        currentAccount.deposit(12000);
        currentAccount.showBalance();
    }
}