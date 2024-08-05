package ArraysQuestion;

public class SecondLargestElement {
	public static void main(String[] args) {

		int[] myArray = { 5, 8, 2, 1, 9 };
		int secondLargest = findSecondLargest(myArray);

		if (secondLargest != -1) {
			System.out.println("Second largest element: " + secondLargest);
		}
	}
	public static int findSecondLargest(int[] arr) {
		if (arr == null || arr.length < 2) {
			return -1;
		}
		int largest = arr[0];
		int secondLargest = Integer.MIN_VALUE;
		for (int num : arr) {
			if (num > largest) {
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest && num != largest) {
				secondLargest = num;
			}
		}
		return secondLargest;
	}
}
