package ThreadTest;

import ThreadModel.CallMe;
import ThreadModel.Caller;

public class CallerTest {
	public static void main(String[] args) {
		CallMe target = new CallMe();

		Caller caller1 = new Caller("Hello", target);
		Caller caller2 = new Caller("Janhavi", target);
		Caller caller3 = new Caller("Chaudhari", target);

		try {
			caller1.getThread().join();
			caller2.getThread().join();
			caller3.getThread().join();
		} catch (InterruptedException exception) {
			System.out.println(exception);
		}
	}
}
