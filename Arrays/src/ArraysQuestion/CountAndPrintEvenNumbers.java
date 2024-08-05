package ArraysQuestion;

public class CountAndPrintEvenNumbers {
	public static void main(String[] args) {
		int[] numbers = { 1,44,55,6,78 };
		int evenCount = 0;

		for (int num : numbers) {
			if (num % 2 == 0) { // Check if even using modulo operator
				evenCount++;
			}
		}

		System.out.println("Number of even numbers: " + evenCount);
	}
}
