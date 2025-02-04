package Builder.Model;

public class User {
	private String name;
	private String email;
	private String address;
	private long phoneNumber;

	private User(UserBuilder builder) {
		this.name = builder.name;
		this.email = builder.email;
		this.address = builder.address;
		this.phoneNumber = builder.phoneNumber;
	}

	public static class UserBuilder {
		private String name;
		private String email;
		private String address;
		private long phoneNumber;

		public UserBuilder withName(String name) {
			this.name = name;
			return this;
		}

		public UserBuilder withEmail(String email) {
			this.email = email;
			return this;
		}

		public UserBuilder withAddress(String address) {
			this.address = address;
			return this;
		}

		public UserBuilder withPhoneNumber(long phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}

		public User build() {
			return new User(this);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
