package exceptions;

public class InsufficientBalanceException extends RuntimeException {
	private double balance;

	public InsufficientBalanceException(double balance) {
		super();
		this.balance = balance;
	}

	public String getMessage() {

		return "your balance is  " + balance;
	}

}
