package Pattern;

import java.util.Scanner;

public class PatternSolving {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number below 10:");
		int number = sc.nextInt();
		int coulnm = 0;
		for (int i = 0; i < number; i++) {
			for (int j = 0; j <= coulnm; j++) {
				System.out.println("*");
			}
			coulnm++;
			System.out.println();
		}
	}

}
