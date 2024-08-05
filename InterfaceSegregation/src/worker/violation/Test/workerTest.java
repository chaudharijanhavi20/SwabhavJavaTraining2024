package worker.violation.Test;

import worker.violation.Model.IWorker;
import worker.violation.Model.labour;
import worker.violation.Model.robot;

public class workerTest {
	public static void main(String[] args) {
		IWorker labour = new labour();
		labour.startWork();

		IWorker robot = new robot();
		robot.eat();
	}
}
