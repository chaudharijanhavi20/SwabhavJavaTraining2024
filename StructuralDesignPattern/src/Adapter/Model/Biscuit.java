package Adapter.Model;

public class Biscuit implements IItems {
	private String name;
	private double mrp;

	public Biscuit(String name, double mrp) {
		super();
		this.name = name;
		this.mrp = mrp;
	}

	@Override
	public String getItemName() {
		return this.name;
	}

	@Override
	public double getItemPrice() {
		return mrp;

	}

}
