package Composite.Model;

public class Leaf implements IComponents {
	int price;
	String name;

	public Leaf(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	@Override
	public void showPrice() {
		System.out.println(name + " : " + price);
	}

}
