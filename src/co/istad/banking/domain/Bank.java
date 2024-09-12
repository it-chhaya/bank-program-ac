package co.istad.banking.domain;

import co.istad.banking.exception.AccountNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Account> bankAccounts;

    public Bank() {
        bankAccounts = new ArrayList<>();

        // init data for testing
        SavingAccount savingAccount = new SavingAccount(
                "88889999",
                "CHAN CHHAYA",
                10000.00,
                0.05
        );

        CheckingAccount checkingAccount = new CheckingAccount(
                "11112222",
                "CHAN DARA",
                5000.00,
                5000.00
        );

        bankAccounts.add(savingAccount);
        bankAccounts.add(checkingAccount);
    }

    public Account findAccount(String accountNumber) throws AccountNotFoundException {
        for (Account account : bankAccounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        throw new AccountNotFoundException("Account not found");
    }

}
