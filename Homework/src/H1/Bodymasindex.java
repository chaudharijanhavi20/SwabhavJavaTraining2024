package H1;

import java.util.Scanner;

public class Bodymasindex {
	public static void main(String[] args) {
		Scanner BMI = new Scanner(System.in);
		System.out.print("Enter your weight in kilogram :");
		float weight = BMI.nextFloat();

		System.out.print("Enter your height in meter:");
		float height = BMI.nextFloat();

		float bodymassindex = weight / (height * height);
		System.out.println("Body mass index is :" + bodymassindex);

	}
}
