package Package;

import java.util.Scanner;

import Model.User;
import exceptions.EmailNotValidException;
import exceptions.PasswordNotValidException;

public class UserTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter email here :");
		String email = scanner.next();
		System.out.println("Entr password :");
		String password = scanner.next();
		try {
			User user = new User(email, password);
			System.out.println(user);
		} catch (EmailNotValidException exception) {
			System.out.println(exception.getMessage());
		} catch (PasswordNotValidException exception) {
			System.out.println(exception.getMessage());
		}

	}
}
