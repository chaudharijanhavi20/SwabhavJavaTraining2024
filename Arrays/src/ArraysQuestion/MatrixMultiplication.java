package ArraysQuestion;

public class MatrixMultiplication {
public static void main(String[] args) {
	
	int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; 

    int number = matrix.length;

    int[][] result = new int[number][number];

    for (int i = 0; i < number; i++) {
        for (int j = 0; j < number; j++) {
            for (int k = 0; k < number; k++) {
                result[i][j] += matrix[i][k] * matrix[k][j];
            }
        }
    }

    for (int i = 0; i < number; i++) {
        for (int j = 0; j < number; j++) {
            System.out.print(result[i][j] + " ");
        }
        System.out.println();
    }
}
}
