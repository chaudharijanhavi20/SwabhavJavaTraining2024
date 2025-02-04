package AbstractFactory.Model;

public class SavingsAccount implements IAccount {
	private int accNo;
	private String name;
	private double balance;

	public SavingsAccount(int accNo, String name, double balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	@Override
	public void credit(double amount) {
		balance += amount;
	}

	@Override
	public void debit(double amount) {
		if (balance >= amount) {
			balance -= amount;
		} else {
			System.out.println("Insufficient balance");

		}
	}
}
