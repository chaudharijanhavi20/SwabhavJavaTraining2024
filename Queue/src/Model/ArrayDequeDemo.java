package Model;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
public static void main(String[] args) {
	ArrayDeque<Integer> deque=new ArrayDeque<Integer>();
	
	deque.offer(10);
	deque.offerLast(20);
	deque.offerFirst(30);
	System.out.println(deque);
	
	System.out.println(deque.getFirst());
	
	System.out.println(deque.poll());
	System.out.println(deque.pollLast()); //dono side se add and remove kar sakte hai
	System.out.println(deque);
	
}
}
