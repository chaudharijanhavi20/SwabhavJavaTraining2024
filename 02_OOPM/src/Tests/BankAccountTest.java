package Tests;

import java.util.Scanner;
import Models.BankAccount;

public class BankAccountTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BankAccount bankaccount[] = new BankAccount[1];
		for (int i = 0; i < bankaccount.length; i++) {
			System.out.print("Account Number: ");
			int accountNumber1 = scanner.nextInt();
			System.out.print("Name: ");
			String name1 = scanner.next();
			System.out.print("Current Balance: ");
			double initialBalance1 = scanner.nextDouble();
			System.out.println("Account Type :");
			String accountType = scanner.next();
			bankaccount[i] = new BankAccount(accountNumber1, name1, initialBalance1, accountType);

		}
		for (int i = 0; i < bankaccount.length; i++) {
			System.out.println("Account 1 - " + bankaccount[i].getName());
			System.out.print("Deposit amount: ");
			double depositAmount1 = scanner.nextDouble();
			bankaccount[i].deposite(depositAmount1);
			System.out.print("Withdraw amount: ");
			double withdrawAmount1 = scanner.nextDouble();
			bankaccount[i].Withdraw(withdrawAmount1);
			
		}

	}
}
