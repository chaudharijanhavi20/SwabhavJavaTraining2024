package ArraysQuestion;

public class FindDiplicates {
	public static void main(String[] args) {
		int array[] = new int[] { 12, 34, 12, 56, 78 };
		System.out.println("Duplicate elements are");
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					System.out.println(array[j]);
				}
			}
		}
	}
}
