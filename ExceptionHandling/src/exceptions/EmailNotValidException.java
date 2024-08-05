package exceptions;

public class EmailNotValidException extends RuntimeException {
	private String email;

	public EmailNotValidException(String email) {
		super();
		this.email = email;
	}

	public String getMessage() {
		return "Incorrect mail id!! Email must be like this abc@gmail.com \n and your email is "+email;
	}
}
