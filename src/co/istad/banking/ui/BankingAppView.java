package co.istad.banking.ui;

import co.istad.banking.domain.Account;
import co.istad.banking.domain.Bank;
import co.istad.banking.domain.SavingAccount;
import co.istad.banking.exception.AccountNotFoundException;

import java.util.Scanner;

public class BankingAppView {

    private final Scanner scanner;
    private final Bank bank;

    public BankingAppView() {
        scanner = new Scanner(System.in);
        bank = new Bank();
    }

    public void run() {
        do {
            displayWelcome();
            int enteredOption = enterMenuOption();
            switch (enteredOption) {
                case 1 -> {
                    System.out.print("Enter account number: ");
                    String accountNumber = scanner.nextLine();

                    try {
                        Account account = bank.findAccount(accountNumber);
                        System.out.print("Enter amount: ");
                        Double amount = Double.parseDouble(scanner.nextLine());
                        account.deposit(amount);
                    } catch (AccountNotFoundException e) {
                        System.out.println(e.getMessage());
                    }

                }
                case 2 -> {
                    System.out.print("Enter account number: ");
                    String accountNumber = scanner.nextLine();

                    try {
                        Account account = bank.findAccount(accountNumber);
                        System.out.print("Enter amount: ");
                        Double amount = Double.parseDouble(scanner.nextLine());
                        account.withdrawal(amount);
                    } catch (AccountNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 3 -> {
                    System.out.print("Enter account number: ");
                    String accountNumber = scanner.nextLine();

                    try {
                        Account account = bank.findAccount(accountNumber);
                        account.checkBalance();
                    } catch (AccountNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 4 -> System.exit(0);
                default -> System.out.println("Invalid option");
            }

            System.out.print("Press enter to continue...");
            scanner.nextLine();

        } while (true);
    }

    public void displayWelcome() {
        System.out.println("Welcome to Banking App");
        System.out.println("----------------------");
        System.out.println("1. Deposit");
        System.out.println("2. Withdrawal");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public int enterMenuOption() {
        do {
            try {
                System.out.print("> Enter menu option: ");
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage() + " is invalid number!");
            }
        } while (true);
    }

}
