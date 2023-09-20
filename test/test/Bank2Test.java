package test;

import classes.Bank2;
import classes.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bank2Test {

    private Bank2 bank;

    @BeforeEach
    void setUp() throws Exception {
        bank = new Bank2();
        BankAccount bankAccount1 = new BankAccount("Account 1", 1, 0.0);
        BankAccount bankAccount2 = new BankAccount("Account 2", 2, 500.0);
        BankAccount bankAccount3 = new BankAccount("Account 3", 3, 1000.0);
        bank.createBankAccount(bankAccount1);
        bank.createBankAccount(bankAccount2);
        bank.createBankAccount(bankAccount3);
    }

    @Test
    public void createBankAccount() throws Exception {
        bank.createBankAccount(new BankAccount("Account 4", 4, 20.0));

        assertEquals(4, bank.getBankAccounts().size());
    }

    @Test
    public void deleteBankAccount() {
        bank.deleteBankAccount(1);

        assertEquals(2, bank.getBankAccounts().size());
    }

    @Test
    public void findBankAccount() throws Exception {
        BankAccount bankAccount = new BankAccount("Account 10", 10, 0.0);
        bank.createBankAccount(bankAccount);
        assertEquals(bankAccount, bank.findBankAccount(10));
    }

}