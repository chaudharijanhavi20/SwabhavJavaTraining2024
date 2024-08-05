package Conditional;

import java.util.Scanner;

public class Max3 {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter first number here :");
	  int number1=sc.nextInt();
	  System.out.print("Enter second number here :");
	  int number2=sc.nextInt();
	  System.out.print("Enter third number here :");
	  int number3=sc.nextInt();
	  
	  int maxnumber=number1;
	  if(number2>maxnumber) {
		  maxnumber=number2;
	  }
	  if(number3>maxnumber) {
		  maxnumber=number3;
		  
	  }System.out.println("Maximum number is :"+maxnumber);
  }
}
