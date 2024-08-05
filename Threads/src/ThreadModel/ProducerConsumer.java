package ThreadModel;

public class ProducerConsumer {
	private final Object lock = new Object();
	private boolean dataReady = false;
	private int data;

	public void produce() {
		synchronized (lock) {
			data = (int) (Math.random() * 100); 
			System.out.println("Producer produced: " + data);
			dataReady = true;
			lock.notify(); 
		}
	}

	public void consume() {
		synchronized (lock) {
			while (!dataReady) {
				try {
					lock.wait(); 
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Consumer consumed: " + data);
			dataReady = false;
			lock.notify(); 
		}
	}
}