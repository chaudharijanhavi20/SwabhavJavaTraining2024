package Model;

import exceptions.EmailNotValidException;
import exceptions.PasswordNotValidException;

public class User {
	private String email;
	private String password;

	public User(String email, String password) {
		super();
		if (!isValidEmail(email))
			throw new EmailNotValidException(email);
		this.email = email;
		if (!isValidPassword(password))
			throw new PasswordNotValidException(password);
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (isValidEmail(email))
			throw new EmailNotValidException(email);
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if (isValidPassword(password))
			throw new PasswordNotValidException(password);
		this.password = password;
	}

	public boolean isValidEmail(String email) {
		String regex = "^[\\w!#$%&'*+/=?^`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^`{|}~-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,}$";
		return email != null && email.matches(regex);
	}

	public boolean isValidPassword(String password) {
		if (password == null || password.length() < 8) {
			return false;
		}
		boolean hasUpperCase = password.chars().anyMatch(Character::isUpperCase);
		boolean hasSpecialChar = password.matches("[^a-zA-Z0-9 ]");
		boolean hasDigit = password.matches("[0-9]");
		return hasUpperCase && hasSpecialChar && hasDigit;
	}

}
