package Sreaming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import StreamModels.Account;

public class AccountTest {
	public static void main(String[] args) {
		List<Account> accounts = new ArrayList<>();

		accounts.add(new Account(12345, "Janhavi", 1000.00));
		accounts.add(new Account(54321, "Sarthak", 500.00));
		accounts.add(new Account(67890, "Vedika", 2000.00));
		accounts.add(new Account(364839, "Deep", 10000.00));

		Optional<Account> minBalanceAccount = accounts.stream().min(Comparator.comparingDouble(Account::getBalance));

		minBalanceAccount.ifPresent(account -> {
			System.out.println("\nAccount with minimum balance:");
			System.out.println("Account Number: " + account.getAccountNumber());
			System.out.println("Name: " + account.getName());
			System.out.println("Balance :"+account.getBalance());
		});

		Optional<Account> maxBalanceAccount = accounts.stream().max(Comparator.comparingDouble(Account::getBalance));

		maxBalanceAccount.ifPresent(account -> {
			System.out.println("\nAccount with maximum balance:");
			System.out.println("Account Number: " + account.getAccountNumber());
			System.out.println("Name: " + account.getName());
			System.out.println("Balance :"+account.getBalance());
		});
		System.out.println("\nNames greater than 6 characters :");
		List<String> longNames = accounts.stream().filter(account -> account.getName().length() > 6)
				.map(Account::getName).collect(Collectors.toList());
		longNames.forEach(System.out::println);

		double totalBalance = accounts.stream().mapToDouble(Account::getBalance).sum();
		System.out.println("\nTotal balance of all accounts: $" + totalBalance);
	}
}
