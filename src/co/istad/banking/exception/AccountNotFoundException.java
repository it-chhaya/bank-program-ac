package co.istad.banking.exception;

public class AccountNotFoundException extends Exception {

    public AccountNotFoundException() {
        super();
    }

    public AccountNotFoundException(String message) {
        super(message);
    }
}
