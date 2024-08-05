package Models;

public class Reactangle implements Shape{
	private int length;
	private int breadth;
	public Reactangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	@Override
	public void area() {
		System.out.println("Area of reactangle "+length*breadth);
		
	}
	public void volume() {
		System.out.println("coming from rectangle class");
	}

}
