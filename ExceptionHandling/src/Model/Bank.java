package Model;

import exceptions.MinimumBalanceException;
import exceptions.OverdraftLimitExceededException;

public class Bank {
	private double balance;
	private double minimumBalance;
	private double overdraftLimit;

	public Bank(double balance, double minimumBalance, double overdraftLimit) {
		if (minimumBalance < 0) {
			throw new IllegalArgumentException("Minimum balance cannot be negative.");
		}
		if (overdraftLimit < 0) {
			throw new IllegalArgumentException("Overdraft limit cannot be negative.");
		}
		this.balance = balance;
		this.minimumBalance = minimumBalance;
		this.overdraftLimit = overdraftLimit;
	}

	public void deposit(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Deposit amount must be positive.");
		}
		balance += amount;
	}

	public void withdraw(double amount) throws MinimumBalanceException, OverdraftLimitExceededException {
		if (amount <= 0) {
			throw new IllegalArgumentException("Withdrawal amount must be positive.");
		}
		if (balance - amount < minimumBalance) {
			throw new MinimumBalanceException();
		}
		if (balance - amount < 0 && Math.abs(balance - amount) > overdraftLimit) {
			throw new OverdraftLimitExceededException();
		}
		balance -= amount;
	}

	public double getBalance() {
		return balance;
	}
}
