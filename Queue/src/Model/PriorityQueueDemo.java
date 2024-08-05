package Model;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {

		PriorityQueue<Integer> numbers = new PriorityQueue<>(); // (a,b)->b-a
		
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		numbers.add(10);
		numbers.add(20);

		System.out.println("Priority queue: " + numbers);

		System.out.println("Peek: " + numbers.peek());
		
		System.out.println("Does the queue contain 3? " + numbers.contains(3));

		System.out.println("Size of queue: " + numbers.size());

//		numbers.clear();

		System.out.println("Is the queue empty? " + numbers.isEmpty());

		while(!numbers.isEmpty()) {
			System.out.println(numbers.poll());
		}
		System.out.println(numbers.poll());

		
	}
}