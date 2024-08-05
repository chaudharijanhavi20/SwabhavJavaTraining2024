package H1;

import java.util.Scanner;

public class PrimePattern {
  public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the number of rows: ");
      int rows = scanner.nextInt();
      int num = 2;

      for (int i = 1; i <= rows; i++) {
          for (int j = 1; j <= i; j++) {
              while (!isPrime(num)) {
                  num++;
              }
              System.out.print(num + " ");
              num++;
          }
          System.out.println();
      }
  }

  static boolean isPrime(int num) {
      if (num <= 1) return false;
      if (num <= 3) return true;
      if (num % 2 == 0 || num % 3 == 0) return false;
      int i = 5;
      while (i * i <= num) {
          if (num % i == 0 || num % (i + 2) == 0) return false;
          i += 6;
      }
      return true;
	  
  }
}
