package Observer.Model;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private int accountNumber;
	private String name;
	private double balance;
	private List<INotifier> notifiers = new ArrayList<>();

	public Account(int accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		try {
			if (balance < 0)
				throw new InsufficientFundsException();
		} catch (InsufficientFundsException exception) {
			System.out.println(exception);
		}
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

	public List<INotifier> getNotifiers() {
		return notifiers;
	}

	public void setNotifiers(List<INotifier> notifiers) {
		this.notifiers = notifiers;
	}

	public void deposit(double amount) {
		balance += amount;
		notifyAllNotifiers("Deposited amount :" + amount);
	}

	public void withdraw(double amount) throws InsufficientFundsException {

		if (balance >= amount) {
			balance -= amount;
			notifyAllNotifiers("Withdrew amount:" + amount);
			return;
		}
		throw new InsufficientFundsException();

	}

	public void registerNotifier(INotifier notifier) {
		notifiers.add(notifier);
		
	}

	private void notifyAllNotifiers(String message) {
		for (INotifier notifier : notifiers) {
			notifier.notify(this);
		}
	}

}