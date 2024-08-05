package Conditional;

import java.util.Scanner;

public class IfElse {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter a number :");
	  int number=sc.nextInt();
	  
	  if(number%2==0) {
		  System.out.println("Number is even");
	  }else {
		  System.out.println("Number is Odd");
	  }
  }
}
