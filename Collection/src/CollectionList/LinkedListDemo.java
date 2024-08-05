package CollectionList;

import java.util.LinkedList;

public class LinkedListDemo {
public static void main(String[] args) {
	LinkedList<Integer> numbers=new LinkedList<Integer>();
	numbers.add(20);
	numbers.add(40);
	numbers.add(50);
	numbers.addFirst(30);
	System.out.println(numbers);
	numbers.removeFirst();
	System.out.println(numbers);
	numbers.getLast();
	System.out.println(numbers);
//	numbers.contains(8);
//	System.out.println(numbers);
	numbers.clear();
	System.out.println(numbers);
}
}
