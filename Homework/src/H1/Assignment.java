package H1;

import java.util.Scanner;

public class Assignment {
  public static void main(String[] args) {
	Scanner Assign=new Scanner(System.in);
	System.out.print("Enter First number : ");
	int number1=Assign.nextInt();
	
	System.out.print("Enter Second number : ");
	int number2=Assign.nextInt();
	
	number1 +=number2;
	 
	System.out.println("Now the first number is " +number1);
	
	number1 -=number2;
	System.out.println("Now the first number is " +number1);
	
	number1 *=number2;
	System.out.println("Now the first number is " +number1);
	
	number1 /=number2;
	System.out.println("Now the first number is " +number1);
	
	number1 %=number2;
	System.out.println("Now the first number is " +number1);
	
	
	
	
	
	
	
}
}
