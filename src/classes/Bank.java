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
}
