package ThreadModel;

public class CallMe {

	public void call(String message) {
		System.out.print("[" + message);
		try {
			Thread.sleep(500);
		} catch (InterruptedException exception) {
			exception.printStackTrace();
		}
		System.out.println("]");
	}
}
