package classes;

public class BankAccount {
    private String accountName;
    private int accountNumber;
    private double balance;

    public BankAccount(String accountName, int accountNumber, double balance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double addFunds(double amount) {
        this.balance += amount;
        return this.balance;
    }

    public double removeFunds(double amount) {
        this.balance -= amount;
        return this.balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
