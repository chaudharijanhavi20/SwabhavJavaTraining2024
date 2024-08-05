package ThreadModel;

public class MyThread implements Runnable{
	private Thread thread;
	public MyThread(String name) {
		super();
		thread=new Thread(this,name);
		thread.start();
	}
	
public Thread getThread() {
		return thread;
	}

	public void setThread(Thread thread) {
		this.thread = thread;
	}

public void run() {
	for (int i = 5; i > 0; i--) {
		System.out.println(Thread.currentThread().getName() + " : " + i);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException exception) {
			System.out.println(exception);
		}
	}

}
}
