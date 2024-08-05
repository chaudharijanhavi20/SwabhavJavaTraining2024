package H1;

import java.util.Scanner;

public class CompoundIntrest {
	public static void main(String[] args) {
		Scanner values = new Scanner(System.in);
		System.out.print("Enter Principle Amount :");
		double principle = values.nextDouble();

		System.out.print("Enter Rate of inrest:");
		double rateofintrest = values.nextDouble();

		System.out.print("Enter Time:");
		double time = values.nextDouble();

		double amount = principle * Math.pow(1 + rateofintrest / 100, time);

		double compoundintrest = amount - principle;
		System.out.println("The compound interest is :" + compoundintrest);

	}
}
