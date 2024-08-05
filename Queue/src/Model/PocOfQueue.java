package Model;

import java.util.LinkedList;
import java.util.Queue;

public class PocOfQueue {
	public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Janhavi");
        queue.add("Isha");
        queue.add("Sarthak");

        System.out.println("Queue: " + queue);

        String front = queue.remove();
        System.out.println("Removed element: " + front);

        System.out.println("Queue after removal: " + queue);

        queue.add("Roshani");

        String peeked = queue.peek();
        System.out.println("Peeked element: " + peeked);

        System.out.println("Queue after peek: " + queue);
    }
}
