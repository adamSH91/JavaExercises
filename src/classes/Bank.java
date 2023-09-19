package classes;

public class Bank {
    private BankAccount[] bankAccounts;

    public Bank() {
        this.bankAccounts = new BankAccount[0];
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
        BankAccount[] newList = new BankAccount[bankAccounts.length + 1];

        System.arraycopy(bankAccounts, 0, newList, 0, bankAccounts.length);

        newList[newList.length - 1] = newBankAccount;
        bankAccounts = newList;
    }
}
