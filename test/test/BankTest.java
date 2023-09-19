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
    void setUp() {
        testBank = new Bank();
        testBank.addAccount(new BankAccount("Account 1", 1, 0.0));
        testBank.addAccount(new BankAccount("Account 2", 2, 10.0));
        testBank.addAccount(new BankAccount("Account 3", 100, 100.0));
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

    /*
    @AfterAll
    void cleanup() {

    }
    */


}