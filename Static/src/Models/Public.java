package Models;

public class Public {
	private String privateMessage = "This is a private message.";

	public void printPublicMessage() {
		System.out.println("Public message: " + privateMessage); 
	}

	protected void printProtectedMessage() {
		System.out.println("Protected message: Access granted only within the package and by subclasses.");
	}

	void printDefaultMessage() {
		System.out.println("Default message: Accessible only within the same package.");
	}

}
