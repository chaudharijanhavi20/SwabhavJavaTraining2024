package Tests;

import java.util.Scanner;

import Exception.InsufficientFundsException;
import Models.Account;
import Models.CurrentAccount;
import Models.SavingAccount;

public class CurrentSavingTests {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Account account = null;

		System.out.println("1. Create Current Account");
		System.out.println("2. Create Savings Account");
		System.out.println("3. Deposit");
		System.out.println("4. Withdraw");
		System.out.println("5. Display Balance");
		System.out.println("6. Exit");

		while (true) {
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter account number: ");
				String accNo = scanner.next();
				System.out.print("Enter name: ");
				String name = scanner.next();
				System.out.print("Enter initial balance: ");
				double balance = scanner.nextDouble();
				account = new CurrentAccount(accNo, name, balance);
				break;
			case 2:
				System.out.print("Enter account number: ");
				accNo = scanner.next();
				System.out.print("Enter name: ");
				name = scanner.next();
				System.out.print("Enter initial balance: ");
				balance = scanner.nextDouble();
				account = new SavingAccount(accNo, name, balance);
				break;
			case 3:
				System.out.print("Enter amount to deposit: ");
				double depositAmount = scanner.nextDouble();
				account.deposit(depositAmount);
				break;
			case 4:
				System.out.print("Enter amount to withdraw: ");
				double withdrawAmount = scanner.nextDouble();
				try {
					account.withdraw(withdrawAmount);
				} catch (InsufficientFundsException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 5:
				account.displayBalance();
				break;
			case 6:
				System.exit(0);
			default:
				System.out.println("Invalid choice");
			}
		}
	}
}
