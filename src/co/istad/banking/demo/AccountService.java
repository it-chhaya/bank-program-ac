package co.istad.banking.demo;

public interface AccountService {

    default void deposit(Double amount) {}

    default void withdrawal(Double amount) {}

    default void checkBalance() {}

}
