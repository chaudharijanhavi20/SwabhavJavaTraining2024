package Models;

public class Triangle implements Shape {
	private int base;
	private int height;

	public Triangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}

	public void area() {
		System.out.println("Area of triangle is " + 0.5 * base * height);

	}

}
