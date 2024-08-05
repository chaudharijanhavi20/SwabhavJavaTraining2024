package Model;

public class SquaringElements {
	public static int[] squareSortedArray(int[] arr) {
		if (arr == null || arr.length == 0) {
			return new int[0];
		}
		int n = arr.length;
		int[] squares = new int[n];
		int left = 0, right = n - 1;

		for (int i = n - 1; i >= 0; i--) {
			int leftSquare = arr[left] * arr[left];
			int rightSquare = arr[right] * arr[right];
			squares[i] = leftSquare > rightSquare ? leftSquare : rightSquare;
			left += (leftSquare > rightSquare) ? 1 : 0;
			right -= (leftSquare > rightSquare) ? 0 : 1;
		}
		return squares;
	}

	public static void main(String[] args) {
		int[] arr = { -4, -1, 0, 3, 5 };
		int[] squaresArr = squareSortedArray(arr);

		System.out.print("Squares of sorted array: ");
		for (int num : squaresArr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
