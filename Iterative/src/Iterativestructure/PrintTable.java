package Iterativestructure;

import java.util.Scanner;

public class PrintTable {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in) ;
	  System.out.println("Enter the number :");
	  int number=sc.nextInt();
	  for(int i=1;i<=10;i++) {
		  for(int j=1;j<=10;j++) {
			  if(i*j>=10) {
				  System.out.print(i*j+" ");
			  }else {
				  System.out.print(i*j+"  ");
			  }
		  }
		  System.out.println();
	  }
	 
  }
}
