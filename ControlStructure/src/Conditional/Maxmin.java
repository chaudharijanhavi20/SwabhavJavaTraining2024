package Conditional;

import java.util.Scanner;

public class Maxmin {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter number 1 here :");
	  int number1=sc.nextInt();
	  
	  System.out.print("Enter number 2 here :");
	  int number2=sc.nextInt();
	  
	  int max=number1;
	  
	  if(number2>max) {
		  max=number2;
	  }System.out.println("maximum number is :"+max);
  }
}
