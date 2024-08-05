package Tests;

import Models.Circle;
import Models.Reactangle;
import Models.Shape;
import Models.Triangle;

public class ShapeTest {
	public static void main(String[] args) {
		Shape shape;
		shape = new Circle(20);
		shape.area();
		shape = new Reactangle(12, 30);
		shape.area();
		shape.volume();
		shape = new Triangle(12, 2);
		shape.area();
		shape.volume();
	}

}
