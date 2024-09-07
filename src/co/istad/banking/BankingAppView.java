package co.istad.banking;

import java.util.Scanner;

public class BankingAppView {

    private final Scanner scanner;

    public BankingAppView() {
        scanner = new Scanner(System.in);
    }

    public void run() {
        do {
            displayWelcome();
            int enteredOption = enterMenuOption();
            switch (enteredOption) {
                case 1 -> System.out.println("Deposit");
                case 2 -> System.out.println("Withdraw");
                case 3 -> System.out.println("Check Balance");
                case 4 -> System.exit(0);
                default -> System.out.println("Invalid option");
            }
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
