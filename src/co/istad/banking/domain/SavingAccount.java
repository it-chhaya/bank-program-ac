package co.istad.banking.domain;

public class SavingAccount extends Account {

    private Double interestRate;

    public SavingAccount(String accountNumber, String accountOwnerName, Double balance, Double interestRate) {
        super(accountNumber, accountOwnerName, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void withdrawal(Double amount) {
        if (amount > 0 && amount <= 5000) {
            balance -= amount;
            System.out.println("Withdrawn: $ " + amount);
        } else {
            System.out.println("Invalid amount!");
        }
    }

    public void calculateInterestRate() {
        Double interest = interestRate * balance;
        Double currentBalance = balance + interest;
        System.out.println("Interest: $ " + interest);
        System.out.println("Current balance: $ " + currentBalance);
    }

}
