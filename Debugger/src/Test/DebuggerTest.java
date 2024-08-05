package Test;

import java.util.Scanner;

public class DebuggerTest {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number:");
	int number1=sc.nextInt();
	System.out.println("Enter second number");
	int number2=sc.nextInt();
	
	int result=addition(number1,number2);
	System.out.println("Sum is :"+result);
	
	int result1=multiplication(number1,number2);
	System.out.println("Answer of multiplication is :"+result1);
	
	int result3=cube(number1);
	System.out.println(""+result3);
	
	}
private static int addition(int number1 ,int number2) {
	return number1+number2;
}
private static int multiplication(int number1,int number2) {
	return number1*number2;
}
private static int cube(int number1) {
	int cubeis=multiplication(number1*number1, number1);
	return cubeis;
	
}

}
