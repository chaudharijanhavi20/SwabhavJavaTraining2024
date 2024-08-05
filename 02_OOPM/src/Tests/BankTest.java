package Tests;

import java.util.Scanner;

import Models.Bank;

public class BankTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Bank[] bankAccounts = new Bank[3];

		for (int i = 0; i < bankAccounts.length; i++) {
			System.out.println("Account " + (i + 1) + " details:");
			System.out.print("Account Number: ");
			int accountNumber = scanner.nextInt();
			System.out.print("Name: ");
			String name = scanner.next();
			scanner.nextLine();
			double initialBalance;
			System.out.print("Current Balance: ");
			initialBalance = scanner.nextDouble();
			System.out.println("Account Type: ");
			String accountType = scanner.next();
			bankAccounts[i] = new Bank(accountNumber, name, initialBalance, accountType);
		}
		// for (int i = 0; i < bankAccounts.length; i++) {
		// System.out.println("Account " + (i + 1) + " - " + bankAccounts[i].getName());
		//
		// System.out.print("Deposit amount: ");
		// double depositAmount = scanner.nextDouble();
		// bankAccounts[i].credit(depositAmount);
		//
		// System.out.print("Withdraw amount: ");
		// double withdrawAmount = scanner.nextDouble();
		// bankAccounts[i].debit(withdrawAmount);
		// }

		Bank maxBalanceAccount = Bank.getMaximumBalanceAccount(bankAccounts);
		if (maxBalanceAccount != null) {
			System.out.println("\nAccount with the maximum balance:");
			System.out.println("  Name: " + maxBalanceAccount.getName());
			System.out.println("  Balance: $" + maxBalanceAccount.getBalance());
		} else {
			System.out.println("No accounts were created.");
		}
	}
}
