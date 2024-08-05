package H1;

import java.util.Scanner;

public class RideBillCalculator {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter your Height :");
	  int height=sc.nextInt();
	  double rideAllowance=0;
	  
	  if(height>120) {
		  System.out.print("Enter your age :");
		  int age=sc.nextInt();
		  
		  if(age<5) {
			 rideAllowance +=5;
		  }else if(age>12 && age<=18) {
			  rideAllowance +=7;
		  }else if(age>=18 && age<=44) {
			  rideAllowance +=12;
		  }
		  else if(age>=45 && age <=55) {
			  rideAllowance +=0;
		  }
		  System.out.print("Want photos?");
		  String photo=sc.next().toLowerCase();
		  if (photo.equals("yes")) {
			  rideAllowance +=3;
		  }
		  System.out.println("Total bills :$"+rideAllowance);
	  }
	  else {
		  System.out.println("You can't ride");
	  }

  }
}
