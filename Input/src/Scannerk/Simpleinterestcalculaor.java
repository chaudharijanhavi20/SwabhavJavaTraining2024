package Scannerk;

import java.util.Scanner;

public class Simpleinterestcalculaor {
	public static void main(String[] args) {
	   Scanner Amount=new Scanner(System.in);
	   System.out.print("Enter principle intrest :");
	   int Principle=Amount.nextInt();
	   
	   System.out.print("Enter rate of intrest :");
	   float Rateofintrest=Amount.nextFloat();
	   
	   System.out.print("Enter years :");
	   float numberofyears=Amount.nextFloat();
	   
	    float simpleintrest=Principle*Rateofintrest*numberofyears/100;
	    System.out.println("simple intrest is :"+simpleintrest);
   }
}
