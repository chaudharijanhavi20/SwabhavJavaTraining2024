package Models;

public class Sudents extends Person {
	private int rollNo;
	private double percentage;

	
	public Sudents(String name, String adress, int age, int rollNo, double percentage) {
		super(name, adress, age);
		this.rollNo = rollNo;
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Sudents [rollNo=" + rollNo + ", percentage=" + percentage + ", Name" + getName()
				+ ", Adress" + getAdress() + ", Age" + getAge() + "]";
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

}
