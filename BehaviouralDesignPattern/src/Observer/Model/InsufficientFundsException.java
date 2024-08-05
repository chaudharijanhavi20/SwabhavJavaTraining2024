package Observer.Model;

public class InsufficientFundsException extends Exception {
	public String getMessage() {
		return "Insufficient Balance";
	}
}
