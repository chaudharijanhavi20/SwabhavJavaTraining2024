package ArraysQuestion;

import java.util.Scanner;

public class MaximumElementOfArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array: ");
	int size=sc.nextInt();
	int array[]=new int[size];
	int max=array[0];
	System.out.println("Enter the elments in array:");
	for(int i=0;i<size;i++) {
		array[i]=sc.nextInt();
	}System.out.println("Array is :");
	for(int i=0;i<size;i++) {
		System.out.print(array[i]+" ");
		if(array[i]>max) {
			max=array[i];
		}
	}
	System.out.print("\nMaximum element is :"+max);
}
}
