package Models;

public class SimpleStatic {
	static private int a=1;
	static private int b=1;
	static private int c=1;

	public static void increment() {
		a++;
		b++;
		c++;

	}

	public void display() {
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
	}
	
	{
	System.out.println("Janhavi Ganesh Chaudhari");
	}
}
