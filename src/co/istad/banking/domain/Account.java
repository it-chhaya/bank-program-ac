package co.istad.banking.domain;

public abstract class Account {

    private String accountNumber;
    private String accountOwnerName;
    protected Double balance;

    public Account(String accountNumber, String accountOwnerName, Double balance) {
        this.accountNumber = accountNumber;
        this.accountOwnerName = accountOwnerName;
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }

    public String getAccountOwnerName() {
        return accountOwnerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(Double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void checkBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Owner: " + accountOwnerName);
        System.out.println("Balance: $ " + balance);
    }

    public abstract void withdrawal(Double amount);

}
