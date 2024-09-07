package co.istad.banking.domain;

public class SavingAccount {
    String accountNumber;
    String accountOwnerName;
    Double balance;
    Double interestRate;

    public SavingAccount() {

    }

    public SavingAccount(String accountNumber) {

    }

    void deposit(Double amount) {
        balance += amount;
    }

    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount();
    }

}
