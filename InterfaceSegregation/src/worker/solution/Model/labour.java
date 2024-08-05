package worker.solution.Model;

public class labour implements IWorkable, ILunchInterval {

	public void start() {
		System.out.println("Labour start working");

	}

	public void stop() {
		System.out.println("Labour stop working ");
	}

	public void eat() {
		System.out.println("lobour eat");

	}

	public void drink() {
		System.out.println("Labour drink");

	}

}
