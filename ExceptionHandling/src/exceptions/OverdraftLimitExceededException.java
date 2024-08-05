package exceptions;

public class OverdraftLimitExceededException extends RuntimeException {
	public String getMessage() {

		return "Withdrawal would exceed overdraft limit.";
	}
}
