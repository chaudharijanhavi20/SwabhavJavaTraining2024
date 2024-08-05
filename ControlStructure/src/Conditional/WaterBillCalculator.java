package Conditional;

import java.util.Scanner;

public class WaterBillCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number of units :");
		double unit = scanner.nextDouble();
		int metercharge = 75;
		double charge = 0;
		if (unit <= 100) {
			charge = unit * 5;

		}
		else if (unit <= 250) {
			charge = (unit -100)* 10+(100*5);
		} else {
			charge = (unit-250)* 20 +(100*5)+(150*10);
		}
		double waterbill = charge + metercharge;

		System.out.println("WATER BILL IS :" + waterbill);
	}
}
