package Models;

public class BankAccount {
	private int accountNumber;
	private String name;
	private double balance;
	private String accountType;

	public BankAccount(int accountNumber, String name, double initialBalance,String accountType) {
		this.accountNumber = accountNumber;
		this.name = name;
		if (initialBalance < 0) {
			throw new IllegalArgumentException("Initial balance cannot be negative.");
		}
		this.balance = initialBalance;
		this.accountType=accountType;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public void deposite(double amount) {

		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited: $" + amount + ". New balnace: $" + balance);

		} else {
			System.out.println("Invalid deposite amount.");

		}
	}

	public void Withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("withdraw: $" + amount + ". new balnce: $" + balance);

		} else if (amount <= 0) {
			System.out.println("Invalid withdrawal amount.");
		} else {
			System.out.println("Insufficieant fund.");
		}
	}
	
}
