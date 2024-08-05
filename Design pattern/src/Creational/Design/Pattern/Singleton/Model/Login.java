package Creational.Design.Pattern.Singleton.Model;

public class Login {
	private static Login login;

	private Login() {
		System.out.println("login created");
	}

	public void status() {
		System.out.println("succesfull !!!!!!!!!");
	}

	public static Login getLogin() {
		if (login == null)
			login = new Login();
		return login;
	}
}
