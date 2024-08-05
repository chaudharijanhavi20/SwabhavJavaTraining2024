package ArraysQuestion;

import java.util.Scanner;

public class SearchingTheNumber {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 3, 5 }, { 7, 9, 11 }, { 13, 15, 17 } };

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number to search: ");
		int target = scanner.nextInt();

		boolean found = false;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == target) {
					found = true;
					break;
				}
			}
			if (found) {
				break;
			}
		}

		if (found) {
			System.out.println("Found");
		} else {
			System.out.println("Not found");
		}
	}
}
