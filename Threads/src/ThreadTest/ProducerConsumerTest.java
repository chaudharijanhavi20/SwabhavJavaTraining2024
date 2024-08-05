package ThreadTest;

import ThreadModel.ProducerConsumer;

public class ProducerConsumerTest {
	public static void main(String[] args) {
		ProducerConsumer pc = new ProducerConsumer();

		Thread producer = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				pc.produce();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread consumer = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				pc.consume();
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		producer.start();
		consumer.start();
	}
}
