package ArraysQuestion;

import java.util.Scanner;

public class ProductOfArray {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] product = productExceptSelf(arr);

        System.out.println("Array after modification (product of all except self):");
        for (int num : product) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }

    public static int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int[] leftProduct = new int[n]; 
        int[] rightProduct = new int[n]; 
        int[] product = new int[n]; 

        leftProduct[0] = 1;
        for (int i = 1; i < n; i++) {
            leftProduct[i] = leftProduct[i - 1] * arr[i - 1];
        }

        rightProduct[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            rightProduct[i] = rightProduct[i + 1] * arr[i + 1];
        }

        for (int i = 0; i < n; i++) {
            product[i] = leftProduct[i] * rightProduct[i];
        }

        return product;
    }
}
