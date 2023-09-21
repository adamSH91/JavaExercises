package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Bank {
    private List<BankAccount> bankAccounts;

    public Bank() {
        this.bankAccounts = new ArrayList<>();
    }

    public BankAccount findAccount(int accountNumber) {
        return bankAccounts.stream().filter(bankAccount -> bankAccount.getAccountNumber() == accountNumber).findFirst().get();
    }

    public void addAccount(BankAccount newBankAccount) throws Exception{
        boolean bankAccountFound = bankAccounts.stream().anyMatch(bankAccount -> bankAccount.getAccountNumber() == newBankAccount.getAccountNumber());

        if (bankAccountFound) {
            throw new Exception("There is already an account with the same number");
        } else {
            bankAccounts.add(newBankAccount);
        }
    }

    public BankAccount[] getAllBankAccountsAsArray() {
        return bankAccounts.toArray(new BankAccount[0]);
    }

    public BankAccount getBankAccountByIndex(int index) {
        return bankAccounts.get(index);
    }

    public String printAllBankAccounts() {
        StringBuilder sb = new StringBuilder();
        bankAccounts.forEach(sb::append);
        return sb.toString();
    }

    public String printByAccountNumber() {
        StringBuilder sb = new StringBuilder();
        bankAccounts.stream().mapToInt
                (bankAccount -> bankAccount.getAccountNumber()).forEach
                (accountNumber -> sb.append(accountNumber + "\n"));
        return sb.toString();
    }

    public void removeBankAccountByIndex(int index) {
        bankAccounts.remove(index);
    }

    public void removeBankAccount(BankAccount bankAccountToRemove) {
        bankAccounts.removeIf(bankAccount -> bankAccount == bankAccountToRemove);
    }

    public void removeBankAccountByAccountNumber(int accountNumber) {
        bankAccounts.removeIf(bankAccount -> bankAccount.getAccountNumber() == accountNumber);
    }

    public double calculateBalanceAverageForAllAccounts() {
        double balancesSum = bankAccounts.stream().mapToDouble
                (BankAccount::getBalance).reduce
                (0.0, Double::sum);
        return Math.floor(balancesSum / bankAccounts.size() * 100) / 100;
    }

    public boolean hasAccount(int accNum) {
        return bankAccounts.stream().anyMatch(bankAccount -> bankAccount.getAccountNumber() == accNum);
    }

    public List<BankAccount> sortBankAccounts() {
        return bankAccounts.stream().sorted
                ((a, b) -> a.getAccountNumber() - b.getAccountNumber()).collect
                (Collectors.toList());
    }
}
