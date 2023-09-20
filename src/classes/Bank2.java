package classes;

import java.util.HashSet;
import java.util.Set;

public class Bank2 {
    Set<BankAccount> bankAccounts;

    public Bank2() {
        this.bankAccounts = new HashSet<>();
    }

    public Set<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void createBankAccount(BankAccount newBankAccount) throws Exception{
        if (bankAccounts.contains(newBankAccount)) {
            throw new Exception("There is already an account with the same number");
        } else {
            bankAccounts.add(newBankAccount);
        }
    }

    public void deleteBankAccount(int accountNumber) {
        BankAccount bankAccountToRemove = null;
        for (BankAccount bankAccount: bankAccounts) {
            if (bankAccount.getAccountNumber() == accountNumber) {
                bankAccountToRemove = bankAccount;
                break;
            }
        }

        bankAccounts.remove(bankAccountToRemove);
     }

    public BankAccount findBankAccount(int accountNumber) {
        for (BankAccount bankAccount: bankAccounts) {
            if (bankAccount.getAccountNumber() == accountNumber) return bankAccount;
        }

        return null;
    }
}
