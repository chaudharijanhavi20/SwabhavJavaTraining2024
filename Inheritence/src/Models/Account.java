package Models;

import Exception.InsufficientFundsException;

public class Account {
	protected String accNo;
	protected String name;
	protected double balance;

	public Account(String accNo, String name, double balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println("Amount " + amount + " deposited successfully.");
	}

	public void withdraw(double amount) throws InsufficientFundsException {
		if (balance >= amount) {
			balance -= amount;
			System.out.println("Amount " + amount + " withdrawn successfully.");
		} else {
			throw new InsufficientFundsException("Insufficient balance");
		}
	}

	public void displayBalance() {
		System.out.println("Current balance: " + balance);
	}

}
