package Scannerk;

import java.util.Scanner;

public class Swapper2 {
   public static void main(String[] args) {
	   Scanner Swapped=new Scanner(System.in);
	   System.out.print("Enter first Number1 :");
	   int number1=Swapped.nextInt();
	   System.out.print("Enter Second number2 :");
	   int number2=Swapped.nextInt();
	   number1 =number1+number2;
	   number2=number1-number2;
	   number1=number1-number2;
	   System.out.println("Swapped Values are : "+number1+ " "+number2);
	   }
}
