package test;

import classes.Bank;
import classes.BankAccount;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    private Bank testBank;

    @BeforeEach
    void setUp() throws Exception {
        testBank = new Bank();
        BankAccount bankAccount1 = new BankAccount("Account 1", 1, 0.0);
        BankAccount bankAccount2 = new BankAccount("Account 2", 2, 10.0);
        BankAccount bankAccount3 = new BankAccount("Account 3", 100, 100.0);
        testBank.addAccount(bankAccount1);
        testBank.addAccount(bankAccount2);
        testBank.addAccount(bankAccount3);
    }

    @Test
    public void findOne() {
        BankAccount bankAccount = testBank.findAccount(1);
        assertEquals(1, bankAccount.getAccountNumber());
        assertEquals("Account 1", bankAccount.getAccountName());
        assertEquals(0.0, bankAccount.getBalance());
    }

    @Test
    public void findTwo() {
        BankAccount bankAccount = testBank.findAccount(2);
        assertEquals(2, bankAccount.getAccountNumber());
        assertEquals("Account 2", bankAccount.getAccountName());
        assertEquals(10.0, bankAccount.getBalance());
    }

    @Test
    public void addAccount() throws Exception {
        testBank.addAccount(new BankAccount("Account 4", 4, 0.0));
    }

    @Test
    public void addDuplicateAccount() throws Exception {
        try {
            testBank.addAccount(new BankAccount("Account 1", 1, 0.0));
        } catch (Exception e) {
            assertEquals("There is already an account with the same number", e.getMessage());
        }
    }

    @Test
    public void getAllBankAccountsAsArray() {
        BankAccount[] bankAccounts = testBank.getAllBankAccountsAsArray();
        assertEquals(1, bankAccounts[0].getAccountNumber());
        assertEquals(2, bankAccounts[1].getAccountNumber());
        assertEquals(100, bankAccounts[2].getAccountNumber());
    }

    @Test
    public void getBankAccountByIndex() throws Exception {
        Bank bank = new Bank();
        BankAccount bankAccount = new BankAccount("Account 20", 20, 0.0);
        bank.addAccount(bankAccount);

        assertEquals(bankAccount, bank.getBankAccountByIndex(0));
    }

    @Test
    public void removeBankAccountByIndex() {
        testBank.removeBankAccountByIndex(0);
        assertEquals("Account number: 2, account name: Account 2, account balance: 10.0 " +
                "Account number: 100, account name: Account 3, account balance: 100.0 ",
                testBank.printAllBankAccounts());
    }

    @Test
    public void removeBankAccountByAccountNumber() {
        testBank.removeBankAccountByAccountNumber(2);
        assertEquals("Account number: 1, account name: Account 1, account balance: 0.0 " +
                "Account number: 100, account name: Account 3, account balance: 100.0 ",
                testBank.printAllBankAccounts());
    }

    @Test
    public void printAllBankAccounts() {
        assertEquals("Account number: 1, account name: Account 1, account balance: 0.0 " +
                "Account number: 2, account name: Account 2, account balance: 10.0 " +
                "Account number: 100, account name: Account 3, account balance: 100.0 ",
                testBank.printAllBankAccounts());

    }

    @Test
    public void calculateBalanceAverageForAllAccounts() {
        assertEquals(36.66, testBank.calculateBalanceAverageForAllAccounts());
    }

    /*
    @AfterAll
    void cleanup() {

    }
    */

}