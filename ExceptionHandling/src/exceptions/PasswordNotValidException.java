package exceptions;

public class PasswordNotValidException extends RuntimeException {
	private String password;

	public PasswordNotValidException(String password) {
		super();
		this.password = password;
	}

	public String getMessage() {
		return "Incorrect Password !! password must be 8 characters long.it should" + " \ncontain one capital letters,"
				+ " one special character and 1 digit.\n and your password is "+password;
	}
}
