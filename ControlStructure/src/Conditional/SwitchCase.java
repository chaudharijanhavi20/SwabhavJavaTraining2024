package Conditional;

import java.util.Scanner;

public class SwitchCase {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter alphabet here :");
	  char charactor=sc.next().charAt(0);
	  char ch='a';
	  switch(ch) {
	  case 'a':
	  case 'e':
	  case 'i':
	  case 'o':
	  case 'u':System.out.println("Vowel");
	  break;
	  default :System.out.println("Not a vowel");
	  }
  }
}
