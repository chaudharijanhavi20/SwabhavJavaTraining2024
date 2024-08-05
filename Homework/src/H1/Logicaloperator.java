package H1;

import java.util.Scanner;

public class Logicaloperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first side of tringle a :");
		int side1 = sc.nextInt();

		System.out.print("Enter first side of tringle a :");
		int side2 = sc.nextInt();

		System.out.print("Enter first side of tringle a :");
		int side3 = sc.nextInt();
		
		boolean validtriangle=(side1+side2>side3) &&(side2+side3>side1)  && (side1+side3>side2); 

		if(validtriangle) {
			System.out.println("Triangle is valid");
		}else {
			System.out.println("Triangle is not valid");
		}
	}
}
