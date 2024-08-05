package Package;

import java.util.Scanner;

import Model.Bank;
import exceptions.MinimumBalanceException;
import exceptions.OverdraftLimitExceededException;

public class BankTest {
	public static void main(String[] args) {
        try {
            Bank account = new Bank(1000, 500, 200);

            account.deposit(500);
            System.out.println("Balance after deposit: $" + account.getBalance());

            account.withdraw(800);
            System.out.println("Balance after withdrawal: $" + account.getBalance());

            account.withdraw(400); // This will throw an OverdraftLimitExceededException
        } catch (MinimumBalanceException e) {
            System.err.println("Minimum balance violation: " + e.getMessage());
        } catch (OverdraftLimitExceededException e) {
            System.err.println("Overdraft limit exceeded: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Invalid input: " + e.getMessage());
        } catch (Exception e) { // Catch-all for unexpected exceptions
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
