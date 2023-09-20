package classes;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<BankAccount> bankAccounts;

    public Bank() {
        this.bankAccounts = new ArrayList<>();
    }

    public BankAccount findAccount(int accountNumber) {
        BankAccount foundAccount = null;

        for (BankAccount bankAccount: bankAccounts) {
            if (bankAccount.getAccountNumber() == accountNumber) {
                foundAccount = bankAccount;
                break;
            }
        }

        return foundAccount;
    }

    public void addAccount(BankAccount newBankAccount) throws Exception{
        for (BankAccount bankAccount: bankAccounts) {
            if (bankAccount.getAccountNumber() == newBankAccount.getAccountNumber()) {
                throw new Exception("There is already an account with the same number");
            }
        }
        bankAccounts.add(newBankAccount);
    }

    public BankAccount[] getAllBankAccountsAsArray() {
        BankAccount[] newBankAccounts = new BankAccount[bankAccounts.size()];

        for (int i = 0; i < bankAccounts.size(); i++) {
            newBankAccounts[i] = bankAccounts.get(i);
        }

        return newBankAccounts;
    }

    public BankAccount getBankAccountByIndex(int index) {
        return bankAccounts.get(index);
    }

    public void printAllBankAccounts() {
        for (BankAccount bankAccount: bankAccounts) {
            System.out.println(bankAccount);
        }
    }

    public void removeBankAccountByIndex(int index) {
        bankAccounts.remove(index);
    }

    public void removeBankAccountByAccountNumber(int accountNumber) {
        for (BankAccount bankAccount: bankAccounts) {
            if (bankAccount.getAccountNumber() == accountNumber) {
                bankAccounts.remove(bankAccount);
            }
        }
    }
}
