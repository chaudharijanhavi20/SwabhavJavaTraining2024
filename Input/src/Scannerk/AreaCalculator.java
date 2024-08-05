package Scannerk;

import java.util.Scanner;

public class AreaCalculator {
  public static void main(String[] args) {
	  Scanner Area=new Scanner(System.in);
	  System.out.print("Enter Radius here :");
	  float radius=Area.nextFloat();
	  double area=(3.14*(radius*radius));
	  System.out.println("Area is :"+area);
	  
	   
  }
}
