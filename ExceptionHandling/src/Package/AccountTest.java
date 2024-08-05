package Package;

import java.util.Scanner;

import Model.Account;
import exceptions.InsufficientBalanceException;

public class AccountTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Account Number :");
		int accountNumber = scanner.nextInt();
		System.out.println("Enter your name :");
		String name = scanner.next();
		System.out.println("Enter balance :");
		double balance = scanner.nextDouble();

		Account account = new Account(accountNumber, name, balance);
		int choice;
		do {
			System.out.println("\nMenu:");
			System.out.println("1. Credit");
			System.out.println("2. Debit");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter amount to credit: ");
				double creditAmount = scanner.nextDouble();
				account.credit(creditAmount);
				System.out.println("New balance: " + account.getBalance());
				break;
			case 2:
				System.out.print("Enter amount to debit: ");
				double debitAmount = scanner.nextDouble();
				try {
					account.debit(debitAmount);
					System.out.println("New balance: " + account.getBalance());
				} catch (InsufficientBalanceException exception) {
					System.out.println("Insufficient balance: " + exception.getMessage());
				}
				break;
			case 3:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice!");
			}
		} while (choice != 3);

	}
}
