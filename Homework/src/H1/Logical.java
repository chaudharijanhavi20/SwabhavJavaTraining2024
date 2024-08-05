package H1;

import java.util.Scanner;

public class Logical {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter a number :");
	 int number=sc.nextInt();
	 boolean iseven=number%2==0;
	 
	 if(iseven) {
		 System.out.println("The number is even");
	 }else {
		 System.out.println("The number is odd");
	 }
	  
	 }
}
