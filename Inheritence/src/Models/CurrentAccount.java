package Models;

import Exception.InsufficientFundsException;

public class CurrentAccount extends Account {

	private final double OVER_DRAFT_LIMIT = 5000;

	public CurrentAccount(String accNo, String name, double balance) {
		super(accNo, name, balance);
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		if (balance + OVER_DRAFT_LIMIT >= amount) {
			balance -= amount;
			System.out.println("Amount " + amount + " withdrawn successfully.");
		} else {
			throw new InsufficientFundsException("Insufficient balance, overdraft limit exceeded.");
		}
	}
}
