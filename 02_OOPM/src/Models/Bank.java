package Models;

public class Bank {
	private int accountNumber;
	private String name;
	private double balance;
	private String accountType;

	public Bank(int accountNumber, String name, double initialBalance, String accountType) {
		if (initialBalance < 0) {
			throw new IllegalArgumentException("Initial balance cannot be negative.");
		}
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = initialBalance;
		this.accountType = accountType;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if (balance < 0) {
			throw new IllegalArgumentException("Balance cannot be negative.");
		}
		this.balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public void credit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited: $" + amount + ". New balance: $" + balance);
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}

	public void debit(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrew: $" + amount + ". New balance: $" + balance);
		} else if (amount <= 0) {
			System.out.println("Invalid withdrawal amount.");
		} else {
			System.out.println("Insufficient funds.");
		}
	}

	public static Bank getMaximumBalanceAccount(Bank[] accounts) {
		Bank maxBalanceAccount = accounts[0];
		for (int i = 1; i < accounts.length; i++) {
			if (accounts[i].getBalance() > maxBalanceAccount.getBalance()) {
				maxBalanceAccount = accounts[i];
			}
		}
		return maxBalanceAccount;
	}

}
