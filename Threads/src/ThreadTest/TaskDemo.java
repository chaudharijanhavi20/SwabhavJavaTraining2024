package ThreadTest;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import ThreadModel.Task;

public class TaskDemo {
	public static void main(String[] args) {
//		int coreCount = Runtime.getRuntime().availableProcessors();
//		System.out.println("Available processor :"+coreCount);
//		ExecutorService executor = Executors.newFixedThreadPool(coreCount);
		ExecutorService executor = Executors.newCachedThreadPool();
		for (int i = 0; i < 100; i++) {
			executor.execute(new Task());
		}
	}
}
