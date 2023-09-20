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

    public void setBankAccounts(Set<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }


}
