package Models;

public class Circle {
private int radius;
 public Circle(int radius) {
	this.radius=radius;
}
public int getRadius() {
	return radius;
}
public void setRadius(int radius) {
	radius=radius;
}

public int AreaOfCircle() {
	return (int) (3.14*radius*radius);
}
}
