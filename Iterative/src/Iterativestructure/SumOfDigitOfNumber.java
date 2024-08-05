package Iterativestructure;

import java.util.Scanner;

public class SumOfDigitOfNumber {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number you want to add:");
	  int number=sc.nextInt();
	  int sum=0;
	  while(number>0) {
		  int rem=number%10;
		  sum=sum+rem;
		  number=number/10;
	  }
	  System.out.println(sum);
  }
}
