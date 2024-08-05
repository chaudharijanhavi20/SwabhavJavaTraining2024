package ArraysQuestion;

import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int size = sc.nextInt();
		int array[] = new int[size];
		int sum=0;
System.out.println("Enter the elements of aaray.");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Array is :");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
			sum=sum+array[i];
		}
		System.out.println("\nAddition of array is :"+sum);

	}
}
