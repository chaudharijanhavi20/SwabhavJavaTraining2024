package H1;

import java.util.Scanner;

public class ConvertMinToHours {
	public static void main(String[] args) {
		Scanner min = new Scanner(System.in);
		System.out.print("Enter number of minues :");
		int numberofmin = min.nextInt();
		int hrs = numberofmin / 60;
		int min1 = numberofmin % 60;
		System.out.println(+hrs + " hours and " + min1 + " minutes");

	}
}
