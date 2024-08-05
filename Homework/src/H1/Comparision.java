package H1;

import java.util.Scanner;

public class Comparision {
  public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  System.out.print("Enter number 1:");
		  int number1=sc.nextInt();
		  
		  System.out.print("Enter number 2:");
		  int number2=sc.nextInt();
		  
		  System.out.print("Enter number 3:");
		  int number3=sc.nextInt();
		  
		  int largest=number1;
		  
		  if(number2>largest) {
			  largest=number2;
		  
	  }if(number3>largest) {
		  largest=number3;
	  }
	  System.out.println("The largest number is : "+largest);
  }
}
