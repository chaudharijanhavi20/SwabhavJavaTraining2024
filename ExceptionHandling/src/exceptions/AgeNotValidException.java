package exceptions;

public class AgeNotValidException extends RuntimeException {
	public String getMessage() {
		return "Age not valid: age must be atleast 18";
	}
}
