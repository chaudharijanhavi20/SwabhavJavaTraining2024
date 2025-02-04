package ThreadTest;

import ThreadModel.MyThread;

public class MyThreadTest {
public static void main(String[] args) {
	MyThread thread1=new MyThread("Thread1");
	MyThread thread2=new MyThread("Thread2");
	MyThread thread3=new MyThread("Thread3");
	
	thread1.getThread().setPriority(Thread.MAX_PRIORITY);
	thread2.getThread().setPriority(Thread.MIN_PRIORITY);
	thread3.getThread().setPriority(Thread.NORM_PRIORITY);
	
	for (int i = 5; i > 0; i--) {
		System.out.println(Thread.currentThread().getName() + " : " + i);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException exception) {
			System.out.println(exception);
		}
	}
}
}
