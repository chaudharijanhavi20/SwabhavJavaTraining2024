package Iterativestructure;

import java.util.Scanner;

public class CheckPrimeNumber {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter the number :");
	  int number=sc.nextInt();
	  int i=2;
	  boolean isprime=true;
	  while(i<=number) {
		  if(number%i==0)
		  
		  isprime=false;
		  i++;
		  
	  
	  }
	  if(isprime==false) {
		  System.out.println("prime number");
	  }else {
		  System.out.println("Not a prime number");
	  }
  }
}
