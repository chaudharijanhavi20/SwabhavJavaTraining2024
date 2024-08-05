package Models;

public class Box {
	private int width;
	private int height;
	private int breadth;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		height = height;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBidth(int breadth) {
		breadth = breadth;
	}

	public int calculateArea() {
		return width * height * breadth;

	}
}
