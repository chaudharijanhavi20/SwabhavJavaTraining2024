package Iterativestructure;

import java.util.Scanner;

public class FactorialOfNumber {
  public static void main(String[] args) {
	  Scanner scanner=new Scanner(System.in);
	  System.out.println("Enter a number :");
	  int number=scanner.nextInt();
	  int factorial=1;
	  for(int i=1;i<=number;i++) {
		  factorial=factorial*i;
		  System.out.println(i);
	  }
  }
}
