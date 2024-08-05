package Tests;
import java.util.Scanner;

import Models.Circle;
public class CircleTest {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int radius=sc.nextInt();
	Circle circle=new Circle(radius);
	System.out.println("For Circle radius :");
//	circle.setRadius(radius);
	System.out.println("Area of circle is :"+circle.AreaOfCircle());
	
}
}
