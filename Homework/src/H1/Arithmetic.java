package H1;

import java.util.Scanner;

public class Arithmetic {
   public static void main(String[] args) {
	   Scanner Calci=new Scanner(System.in);
	   System.out.print("Enter first value :");
	   int number1=Calci.nextInt();
	   
	   System.out.print("Enter second value :");
	   int number2=Calci.nextInt();
	   
	   int sum=number1+number2;
	   int sub=number1-number2;
	   int mul=number1*number2;
	   int div=number1/number2;
	   System.out.println("Addition of the numbers is :"+sum);
	   System.out.println("Substraction of two numbers is :"+sub);
	   System.out.println("Multiplication of two numbers is :"+mul);
	   System.out.println("Division of two numbers is :"+div);
	   
   }
}
