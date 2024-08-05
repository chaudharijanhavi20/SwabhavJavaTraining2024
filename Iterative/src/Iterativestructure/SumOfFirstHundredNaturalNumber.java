package Iterativestructure;

import java.util.Scanner;

public class SumOfFirstHundredNaturalNumber {
  public static void main(String[] args) {
	  Scanner scanner=new Scanner(System.in);
	  System.out.println("Enter a Number here :");
	  int number=scanner.nextInt();
	  int i=1;
	  int sum=0;
	  while(i<=number) {
		  sum=sum+i;
		  i++;
	  }
	  System.out.println(sum);
  }
}
