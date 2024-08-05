package Conditional;

import java.util.Scanner;

public class MonthNumberCheckSeason {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter month number here :");
	  int monthnumber=sc.nextInt();
	  int month=1;
	  switch(month) {
	  case 1:
	  case 10:
	  case 12:
	  case 11:System.out.println("Winter season");
	  break;
	  case 3:
	  case 4:
	  case 5:
	  case 2:System.out.println("Summer season");
	  break;
	  case 6:
	  case 7:
	  case 8:
	  case 9:System.out.println("rainy season");
	  break;
	  default:System.out.println("Wrong month");
	  
	  }
  }
}
