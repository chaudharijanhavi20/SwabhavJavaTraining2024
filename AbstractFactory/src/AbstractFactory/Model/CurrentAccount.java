package AbstractFactory.Model;

public class CurrentAccount implements IAccount {
	private int accNo;
	private String name;
	private double balance;
	private double overdraft;

	public CurrentAccount(int accNo, String name, double balance, double overdraft) {
		super();
		this.overdraft = overdraft;
	}

	@Override
	public void credit(double amount) {
		balance += amount;
	}

	@Override
	public void debit(double amount) {
		if (balance + overdraft >= amount) {
			balance -= amount;
		} else {
			System.out.println("Insufficient balance and overdraft limit");
		}
	}
}