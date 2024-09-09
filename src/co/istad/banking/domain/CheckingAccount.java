package co.istad.banking.domain;

public class CheckingAccount extends Account {

    private Double overDraftAmount;

    public CheckingAccount(String accountNumber, String accountOwnerName, Double balance, Double overDraftAmount) {
        super(accountNumber, accountOwnerName, balance);
        this.overDraftAmount = overDraftAmount;
    }

    public Double getOverDraftAmount() {
        return overDraftAmount;
    }

    public void setOverDraftAmount(Double overDraftAmount) {
        this.overDraftAmount = overDraftAmount;
    }

    @Override
    public void withdrawal(Double amount) {
        if (amount > 0 && balance + overDraftAmount >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $ " + amount);
        } else {
            System.out.println("Insufficient amount!");
        }
    }

}
