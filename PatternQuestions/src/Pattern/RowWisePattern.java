package Pattern;

import java.util.Scanner;

public class RowWisePattern {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number :");
	   int number=sc.nextInt();
	   int num=1;
	   int count=0;
	   if(number>0) {
	   for(int i=1; i<number;i++) {
		   for(int j=0;j<=count;j++) {
			   System.out.println(num+"");
		   }
		   count++;
		   System.out.println("");
	   }
	   }
	   else {
		   
	   }
   }
}
