package ArraysQuestion;

import java.util.Scanner;

public class CheckTheNumber {
public static void main(String[] args) {
	int array[]=new int[]{20,45,67,89,30};
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the element you want to find :");
	int search_element=sc.nextInt();
	boolean found=false;
	for(int i=0;i<array.length;i++) {
		if(search_element==array[i]) {
			System.out.println("Element is found");
			found=true;
			break;
		}
	}
	if(found==false) {
		System.out.println("Not found");
	}
}
}
