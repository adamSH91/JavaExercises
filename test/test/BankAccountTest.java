package test;

import classes.BankAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    public void createWithAllDetails() {
        int accountNumber = 1;
        double balance = 1.562;
        String accountName = "Bank Account";

        BankAccount ba = new BankAccount(accountName, accountNumber, balance);
        assertEquals(balance, ba.getBalance());
        assertEquals(accountNumber, ba.getAccountNumber());
        assertEquals(accountName, ba.getAccountName());
    }

    @Test
    public void createWithAccountNumber() {
        int accountNumber = 10;
        BankAccount bankAccount = new BankAccount(accountNumber);

        assertEquals(accountNumber, bankAccount.getAccountNumber());
    }

    @Test
    public void createWithAccountNumberAndBalance() {
        int accountNumber = 20;
        double balance = 500.0;
        BankAccount bankAccount = new BankAccount(accountNumber, balance);

        assertEquals(accountNumber, bankAccount.getAccountNumber());
        assertEquals(balance, bankAccount.getBalance());
    }

    @Test
    public void addFunds() {
        double fundsToAdd = 100.0;
        BankAccount bankAccount = new BankAccount("Account1", 5, 0.0);

        assertEquals(100.0, bankAccount.addFunds(100.0));
    }

    @Test
    public void removeFunds() throws Exception {
        double fundsToRemove = 200.0;
        BankAccount bankAccount = new BankAccount("Account1", 5, 400.0);

        assertEquals(200.0, bankAccount.removeFunds(200.0));
    }

    @Test
    public void checkAccountNumberCounterIncrementsAutomatically() {
        BankAccount bankAccount = new BankAccount("Account1", 5, 400.0);
        BankAccount bankAccount2 = new BankAccount("Account2", 5, 400.0);
        BankAccount bankAccount3 = new BankAccount("Account3", 5, 400.0);

        assertEquals(3, BankAccount.accountNumberCounter);
    }

    @Test
    public void removeFundsFails() throws Exception {
        BankAccount bankAccount = new BankAccount(0, 0.0);

        try {
            bankAccount.removeFunds(20.0);
        } catch (Exception e) {
            assertEquals("You can't have a balance less than zero!", e.getMessage());
        }
    }
}