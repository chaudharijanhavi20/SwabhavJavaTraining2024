package worker.violation.Model;

public class robot implements IWorker {

	public void startWork() {
		System.out.println("Robot start working ");

	}

	public void stopWork() {
		System.out.println("Robot stop working ");

	}

	public void eat() {
		System.out.println("Robot eat ");

	}

	public void drink() {
		System.out.println("Robot drink");

	}

}
