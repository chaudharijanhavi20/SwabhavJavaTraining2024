package Conditional;

import java.util.Scanner;

public class ChoiceBasesSwitch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter temperature: ");
		double temperature = scanner.nextDouble();

		System.out.println("Choose conversion:");
		System.out.println("1. Celsius to Fahrenheit");
		System.out.println("2. Fahrenheit to Celsius");
		System.out.println("3. Celsius to Kelvin");
		System.out.println("4. Kelvin to Celsius");
		System.out.println("5. Fahrenheit to Kelvin");
		System.out.println("6. Kelvin to Fahrenheit");

		int choice = scanner.nextInt();

		// double fahrenheit=(9/5)*temperature+32;
		//
		// double celsius=(fahrenheit-32)*5/9;

		switch (choice) {
		case 1:
			double fahrenheit = (9 / 5) * temperature + 32;
			System.out.println("The ans is:" +fahrenheit);
			break;
		case 2:
			double celsius = (temperature - 32) * 5 / 9;
			System.out.println("The ans is:" +celsius);
			break;
		case 3:
			double kelvin=(temperature-32)*5/9+273.15;
			System.out.println("The ans is:" +kelvin);
		default:
			System.out.println("wrong choice");
		}

	}
}
