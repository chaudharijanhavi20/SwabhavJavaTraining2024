package worker.solution.Test;

import worker.solution.Model.IWorkable;
import worker.solution.Model.Robot;
import worker.solution.Model.labour;

public class workerTest {
	public static void main(String[] args) {
		labour labour = new labour();
		labour.start();
		labour.stop();
		labour.drink();
		labour.eat();

		IWorkable robot = new Robot();
		robot.start();
		robot.stop();
	}
}
