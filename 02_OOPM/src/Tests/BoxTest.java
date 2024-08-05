package Tests;
import java.util.Scanner;

import Models.Box;
public class BoxTest {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Box box=new Box();
		System.out.println("Enter width:");
		int width=sc.nextInt();
		box.setWidth(width);
		
		System.out.println("Enter height:");
		int height=sc.nextInt();
		box.setHeight(height);
		
		System.out.println("Enter depth:");
		int breadth=sc.nextInt();
		box.setBidth(breadth);
		
		
		
		System.out.println("Area of box is "+box.calculateArea());
		
		
	}


}
