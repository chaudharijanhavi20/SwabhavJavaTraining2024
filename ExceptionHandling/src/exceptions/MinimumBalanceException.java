package exceptions;

public class MinimumBalanceException extends RuntimeException {
	public String getMessage() {
		return "Withdrawal would cause balance to fall below minimum.";
	}

}
