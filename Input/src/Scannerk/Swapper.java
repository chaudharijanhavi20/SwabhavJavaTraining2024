package Scannerk;

import java.util.Scanner;

public class Swapper {
   public static void main(String[] args) {
	   Scanner Swap=new Scanner(System.in);
	   System.out.println("Enter number 1 :");
	   int number1=Swap.nextInt();
	   System.out.println("Enter number 2 :");
	   int number2=Swap.nextInt();
	    
	   int numberchanged=number1;
	    number1=number2;
	    number2=numberchanged;
	    
	   System.out.println("Now here your Swaped numbers :"+number1+ " "+number2);
	   
	   
   }
}
