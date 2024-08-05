package ocp.violation.Model;

public class Account {
	private int accountNumber;
	private String name;
	private double principle;
	private int duration;
	private FestivalType festival;

	public Account(int accountNumber, String name, double principle, int duration, FestivalType festival) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.principle = principle;
		this.duration = duration;
		this.festival = festival;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrinciple() {
		return principle;
	}

	public void setPrinciple(double principle) {
		this.principle = principle;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public FestivalType getFestival() {
		return festival;
	}

	public void setFestival(FestivalType festival) {
		this.festival = festival;
	}

	public double getIntrestRate(FestivalType festival) {
		switch (festival) {
		case NEWYEAR:
			return 8.0;
		case DIWALI:
			return 8.5;
		case HOLI:
			return 7.5;
		case OTHERS:
			return 6.5;
		default:
			throw new IllegalArgumentException("Invalid festival type");
		}
	}

	public double calculateSimpleIntrest(double principle, int duration, FestivalType festival) {
		return principle * duration * getIntrestRate(festival);
	}

	public void printAccount() {
		System.out.println("Account numbetr : " + accountNumber);
		System.out.println("name : " + name);
		System.out.println("duration : " + duration);
		System.out.println("Principle : " + principle);
		System.out.println("Festival : " + getIntrestRate(festival));
		System.out.println("SimpleIntrest : " + calculateSimpleIntrest(principle, accountNumber, festival));
	}
}
