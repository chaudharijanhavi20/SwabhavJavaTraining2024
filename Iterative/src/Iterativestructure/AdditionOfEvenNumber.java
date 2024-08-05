package Iterativestructure;

import java.util.Scanner;

public class AdditionOfEvenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number here:");
		int number = sc.nextInt();
		int i = 2;
		int sum = 0;
		while (i <= number) {
			sum = sum + i;
			i+=2;
		}
		System.out.println(sum);
	}
}
