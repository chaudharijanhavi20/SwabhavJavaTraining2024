package CollectionList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import Model.Account;

public class AccountTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Account> accounts = new ArrayList<Account>();
		readAccounts(accounts, scanner);
		displayAccount(accounts);
		findAccountWithMaxBalance(accounts);

	}

	private static void readAccounts(List<Account> accounts, Scanner scanner) {
		for (int i = 0; i < 3; i++) {
			System.out.println("\nEnter details for account " + (i + 1));
			System.out.print("Account No: ");
			int accNo = scanner.nextInt();
			scanner.nextLine(); // Consume newline character after int input
			System.out.print("Name: ");
			String name = scanner.nextLine();
			System.out.print("Balance: ");
			double balance = scanner.nextDouble();

			accounts.add(new Account(accNo, name, balance));
		}
	}

	private static void displayAccount(List<Account> accounts) {
		for (Account account : accounts)
			System.out.println(account);
	}

	private static void findAccountWithMaxBalance(List<Account> accounts) {

		Account accountWithMaxBalance = accounts.get(0);
		for (Account account : accounts) {
			if (account.getBalance() > accountWithMaxBalance.getBalance()) {
				accountWithMaxBalance = account;
			}
		}
		System.out.println("Maximun balance Account is ");
		System.out.println(accountWithMaxBalance);
	}
	private static void sortAccountsByBalance(List<Account> accounts) {
        // Use Collections.sort to sort accounts by balance in ascending order
        Collections.sort(accounts, (a1, a2) -> Double.compare(a1.getBalance(), a2.getBalance()));
        System.out.println(accounts);
       
    }
	
}