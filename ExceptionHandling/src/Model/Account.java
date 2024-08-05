package Model;

import exceptions.InsufficientBalanceException;

public class Account {
	private int accountNumber;
	private String name;
	private double balance;

	public Account(int accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
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
		this.balance = balance;
	}

	public double credit(double amount) {

		if (amount > 0)
			balance += amount;
		return balance;
	}

	public double debit(double amount) throws InsufficientBalanceException {
		if (amount <= 0 || amount > balance) {
			throw new InsufficientBalanceException(balance);
		}
		balance -= amount;
		return balance;
	}

}