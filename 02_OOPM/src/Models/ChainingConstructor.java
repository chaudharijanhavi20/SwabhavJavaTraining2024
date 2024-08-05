package Models;

public class ChainingConstructor {
	private int width;
	private int length;
	private int height;

	public ChainingConstructor() {
		width = 10;
		length = 10;
		height = 10;
	}

	public ChainingConstructor(int width, int length) {
		this();
		this.width = width;
		this.length = length;
	}

	public ChainingConstructor(int width, int length, int height) {
		this();
		this.width = width;
		this.length = length;
		this.height = height;
	}

	@Override
	public String toString() {
		return "ChainingConstructor [width=" + width + ", length=" + length + ", height=" + height + "]";
	}

}
