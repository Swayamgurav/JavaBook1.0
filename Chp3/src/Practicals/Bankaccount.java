package Practicals;

public class Bankaccount {

    static String bankName = "Trust Bank"; 
    String accountHolder;
    double balance;
    
    public Bankaccount(String accountHolder, double initialDeposit) {
        this.accountHolder = accountHolder;
        this.balance = initialDeposit;
    }

    
    public void deposit(double amount) {
       
        double transactionFee = 1.5;

        balance += (amount - transactionFee); 
        System.out.println("Deposited: " + amount);
        System.out.println("Transaction fee: " + transactionFee);
        System.out.println("New Balance: " + balance);
    }

    public void displayAccountInfo() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Bankaccount acc1 = new Bankaccount("Alice", 1000);
        Bankaccount acc2 = new Bankaccount("Bob", 2000);

        acc1.deposit(500);
        acc2.deposit(1000);

        acc1.displayAccountInfo();
        acc2.displayAccountInfo();
    }
}
