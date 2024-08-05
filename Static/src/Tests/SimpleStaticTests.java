package Tests;

import Models.SimpleStatic;

public class SimpleStaticTests {
	public static void main(String[] args) {
		SimpleStatic demo1 = new SimpleStatic();
		demo1.display();
		SimpleStatic.increment();
		demo1.display();

		SimpleStatic demo2 = new SimpleStatic();
		demo2.display();
		SimpleStatic.increment();
		demo2.display();
	}
	static
	{
		System.out.println("Janhavi");
		}
}
