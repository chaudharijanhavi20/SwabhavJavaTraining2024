package ArraysQuestion;

import java.util.Scanner;

public class ReverseTheArray {
public static void main(String[] args) {
	int array[]=new int[5];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter elements in array:");
	for(int i=0;i<array.length;i++) {
		array[i]=sc.nextInt();
	}System.out.print("Array elements:");
	for(int i=0;i<array.length;i++) {
		System.out.print(array[i]+" ");
	}
	System.out.print("\nReverse array :");
	for(int i=array.length-1;i>=0;i--) {
		System.out.print(array[i]+" ");
	}
	
}
}
