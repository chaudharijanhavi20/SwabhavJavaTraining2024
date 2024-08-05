package H1;

import java.util.Scanner;

public class CurrencyDenominationApp {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.print("Enter amount which should be multiple of 100 :");
	   int amount=sc.nextInt();
	   
	   int note2000=amount/2000;
	   amount %=2000;
	   
	   int note500=amount/500;
	   amount %=500;
	   
	   int note200=amount/200;
	   amount %=200;
	   
	   int note100=amount/100;
	   
	   System.out.println("Notes of 2000 used: "+note2000);
	   System.out.println("Notes of 500 used: "+note500);
	   System.out.println("Notes of 200 used: "+note200);
	   System.out.println("Notes of 100 used: "+note100);
	   
   }
}
