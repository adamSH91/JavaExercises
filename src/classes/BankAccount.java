package classes;

public class BankAccount {
    private String accountName;
    private int accountNumber;
    public static int accountNumberCounter = 0;
    private double balance;

    public BankAccount(String accountName, int accountNumber, double balance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        accountNumberCounter++;
        this.balance = balance;
    }

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumberCounter;
        accountNumberCounter++;
        this.balance = balance;
    }

    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumberCounter;
        accountNumberCounter++;
    }

    public double addFunds(double amount) {
        this.balance += amount;
        return this.balance;
    }

    public double removeFunds(double amount) throws Exception {
        if (this.balance - amount < 0) throw new Exception("You can't have a balance less than zero!");
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

    @Override
    public String toString() {
        return "Account number: " + this.accountNumber + ", account name: " +
                this.accountName + ", account balance: " + this.balance + " ";
    }
}
