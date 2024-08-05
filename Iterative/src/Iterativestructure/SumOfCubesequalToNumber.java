package Iterativestructure;

import java.util.Scanner;

public class SumOfCubesequalToNumber {
  public static void main(String [] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter a number here :");
	  int number=sc.nextInt();
	  int sum=0;
	  int pow=0;
	  int temp=number;
	  while(number>0) {
		  pow++;
		  number=number/10;
	  }
	  number=temp;
	  while(number>0) {
		  int rem=number%10;
		  sum=sum+(int)Math.pow(rem, pow);
		  number=number/10;
	  }
	  System.out.println(sum);
  }
}
