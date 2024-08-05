package ISayableTest;

import ISayable.ISayables;

public class IsayableTest {
	public static void main(String[] args) {
		ISayables greet = name -> System.out.print("Hello" + name);
		greet.say("World");
	}
}
