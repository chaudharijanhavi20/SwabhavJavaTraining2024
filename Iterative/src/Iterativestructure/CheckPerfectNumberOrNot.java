package Iterativestructure;

import java.util.Scanner;

public class CheckPerfectNumberOrNot {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter a number :");
	  int number=sc.nextInt();
	  int temp=number;
	  int sum=0;
	  int i=1;
	  while(i<number) {
		  if(number%i==0) {
		  sum=sum+i;
		  }
		  i++;
	  }
	  if(sum==temp){
		  System.out.println("Perfect number");
	  }else {
		  System.out.println("Not perfect number");
	  }
  }
}
