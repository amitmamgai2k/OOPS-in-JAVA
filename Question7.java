class BankAccount{
    protected String accountHolderName;
    protected int accountNumber;
    protected double balance;
    public BankAccount(String accountHolderName,int accountNumber, double balance){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Rs"+amount+" Deposited.");
        }else System.out.println("Invalid deposit amount.");
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Rs"+amount+" Withdraw.");
        }else System.out.println("Insufficient balance or invalid amount.");
    }
    public void showBalance(){
        System.out.println("Account Holder: " + accountHolderName + ", Account Number: " + accountNumber + ", Current Balance: Rs" + balance);
    }
}
class SavingAccount extends BankAccount{
    final double interestRate = 6;
    public SavingAccount( String accountHolderName,int accountNumber,double balance ){
        super(accountHolderName,accountNumber,balance);
    }
     public void addInterest(){
        double interest = balance*interestRate/100;
        balance+=interest;
        System.out.println("Interest added: Rs"+ interest);
     }
}
class CurrentAccount extends BankAccount{
    final double miniBalanceRequired =1000.0;
    public CurrentAccount(String accountHolderName,int accountNumber,double balance){
        super(accountHolderName, accountNumber, balance);
    }
    @Override
    public void withdraw(double amount){
        if(amount>0 && (balance-amount)>=miniBalanceRequired){
            balance-=amount;
            System.out.println("Rs"+amount+" Withdraw.");
        }
        else System.out.println("Balance should be greater than Minimum Balance for withdraw.");
    }
}
public class Question7{
    public static void main(String[] args) {
        // creating a saving account
        SavingAccount savingAccount = new SavingAccount("Amit",112345,2000.0);
        System.out.println("\n---Saving Account---");
        savingAccount.showBalance();
        savingAccount.deposit(1000.0);
        savingAccount.addInterest();
        savingAccount.showBalance();
        //creating a current user
        CurrentAccount currentAccount = new CurrentAccount("Ruka", 2116404524, 1800);
        System.out.println("\n--- Current Account ---");
        currentAccount.showBalance();
        currentAccount.withdraw(1000);
        currentAccount.withdraw(500);
        currentAccount.deposit(12000);
        currentAccount.showBalance();   
    }
}
