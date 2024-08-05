package H1;

import java.util.Scanner;

public class Bitwiseoperators {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter side1 og triangle ");
	  int side1=sc.nextInt();
	  
	  System.out.println("Enter side2 og triangle ");
	  int side2=sc.nextInt();
	  
	  System.out.println("Enter side3 og triangle ");
	  int side3=sc.nextInt();
	  
	  boolean validtriangle=(side1+side2>side3) && (side1+side3>side2) && (side2+side3>side1);
	  
	  if(validtriangle) {
		  System.out.println("triangle is valid");
	  }
	  else {
		  System.out.println("Triangle is no valid");
	  }
	  
	  
	  
	  
  }
}
