package Tests;

import Overriding.Rectangle;
import Overriding.Shape;
import Overriding.Circle;

public class ShapeTests {
	public static void main(String[] args) {
		Shape shape;
		shape = new Circle(20);
		shape.area();

		shape = new Rectangle(15, 12);
		shape.area();
	}

}
