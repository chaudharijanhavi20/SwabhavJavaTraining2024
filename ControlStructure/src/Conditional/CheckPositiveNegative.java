package Conditional;

import java.util.Scanner;

public class CheckPositiveNegative {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number :");
	   int number=sc.nextInt();
	   if(number<0) {
		   System.out.println("Number is negative");
	   }
	   if(number==0) {
		   System.out.println("Number is zero");
	   }
	   else {
		   System.out.println("Number is postive");
	   }
	   
   }
}
