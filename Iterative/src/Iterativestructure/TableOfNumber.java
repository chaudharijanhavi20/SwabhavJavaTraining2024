package Iterativestructure;

import java.util.Scanner;

public class TableOfNumber {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number:");
	  int number=sc.nextInt();
	  for(int i=number;i<=10;i++) {
		  number=number*i;
		  System.out.println(number);
	  }
  }
}
