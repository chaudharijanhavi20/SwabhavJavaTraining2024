package Iterativestructure;

import java.util.Scanner;

public class PalindromNumber {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number to check weather it is palindrom or not :");
	  int number=sc.nextInt();
	  int temp=number;
	  int rev=0;
	  while(number>0) {
		  int rem=number%10;
		  rev=(rev*10)+rem;
		  number=number/10;
		 
	  }
	  if(rev==temp) {
		  System.out.println("It is palindrom");
	  }else {
		  System.out.println("Not palindrom");
	  }
  }
}
