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

    public void addAccount(BankAccount newBankAccount) {
        bankAccounts.add(newBankAccount);
    }
}
