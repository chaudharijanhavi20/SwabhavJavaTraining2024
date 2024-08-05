package ArraysQuestion;

public class MaximumElementFromMultipleArray {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };

		int max = matrix[0][0]; // Initialize with first element

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] > max) {
					max = matrix[i][j];
				}
			}
		}

		System.out.println("Maximum element: " + max);
	}
}
