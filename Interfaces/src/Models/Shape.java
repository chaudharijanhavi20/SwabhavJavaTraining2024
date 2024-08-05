package Models;

public interface Shape {
	default void volume() {
		System.out.println("we can give definition using default keyword");
	}

	void area();
}
