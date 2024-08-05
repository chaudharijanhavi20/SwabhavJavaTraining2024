package Builder.Test;

import Builder.Model.User;

public class UserTest {
	public static void main(String[] args) {
		User user = new User.UserBuilder()
				.withName("Janhavi")
				.withEmail("janhavichaudhari8300@gmail.com")
				.withAddress("sector 3")
				.build();
		System.out.println("Name: " + user.getName());
		System.out.println("Email: " + user.getEmail());
		System.out.println("Address: " + user.getAddress());
		System.out.println("Phone Number: " + user.getPhoneNumber());

	}

}
