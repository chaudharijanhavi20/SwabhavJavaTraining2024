package H1;

import java.util.Scanner;

public class Areaoftrapezoid {
   public static void main(String[] args) {
	   Scanner Area=new Scanner(System.in);
	   System.out.print("Enter the lenght of base1 :");
	   double base1=Area.nextDouble();
	   
	   System.out.print("Enter the lenght of base2 :");
	   double base2=Area.nextDouble();
	   
	   System.out.print("Enter the height :");
	   double height=Area.nextDouble();
	   
	   double area=((base1+base2)/2)*height;
	   System.out.println("Area of trapezoid is :"+area);
   }
}
